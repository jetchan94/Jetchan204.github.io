% Load RFin.mat from Simulink Model (Project 6)
% 1 Volt = 0dBm
clc, clear

rfin_wave = load('RFin.mat');
t = rfin_wave.rfin(1,:);
rf = rfin_wave.rfin(2,:); 

h = t(2)-t(1);
Fs0 = 1/h;
nSize = size(t);
n = nSize(1,2);
nDiv = 1;
t0 = t(1:nDiv:n);
p0 = rf(1:nDiv:n);
Fs = Fs0/nDiv;
Fr = (650/770)*Fs0*8/n;

% Bowtie Antenna
figure(1);
plot(t(n-5000:n), rf(n-5000:n));
xlabel('time (seconds)');
ylabel('Amplitude (Volt)');
title('Bowtie Antenna');

% Welch Power Spectral Density Estimate
figure(2);
%input,segment length,overlapped samples,DFT points,sample rate
pwelch(350*rf,[],[], [], Fs); % peak1 = 0.01032 dBm, peak2 = -0.04355 dBm 
ylabel('Power (dBm)');

