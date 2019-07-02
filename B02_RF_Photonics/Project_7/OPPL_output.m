% Load vout.mat from Simulink Model (Project 7)

clc, clear
% Call out to vin.m file
%vin;
% Load vout.mat
vout_wave = load('vout.mat');
t = vout_wave.vout(1, :);
vo = vout_wave.vout(2, :);
h = t(2)-t(1);
Fs0 = 1/h;
nSize = size(t);
n = nSize(1,2);
nDiv = 1;
t0 = t(1:nDiv:n);
v0 = vo(1:nDiv:n);
Fs = Fs0/nDiv;
Fr = (650/770)*Fs0*8/n;

% Bowtie Antenna
figure(3);
plot(t(n-5000:n), vo(n-5000:n));
xlabel('time (seconds)');
ylabel('Amplitude (Volt)');
title('Bowtie Antenna');

% Welch Power Spectral Density Estimate
figure(4);
% input,segment length,overlapped samples,DFT points,sample rate
pwelch(sqrt(9000*Fr/50)*vo,[],[], [], Fs);
ylabel('Power (dBm)');
