% Load vin.mat from Simulink Model (Project 7)
% 1 Volt = 0dBm
clc, clear

vin_wave = load('vin.mat');
t = vin_wave.vin(1,:);
vi = vin_wave.vin(2,:); 

h = t(2)-t(1);
Fs0 = 1/h;
nSize = size(t);
n = nSize(1,2);
nDiv = 1;
t0 = t(1:nDiv:n);
p0 = vi(1:nDiv:n);
Fs = Fs0/nDiv;
Fr = (650/770)*Fs0*8/n;

% Bowtie Antenna
figure(1);
plot(t(n-5000:n), vi(n-5000:n));
xlabel('time (seconds)');
ylabel('Amplitude (Volt)');
title('Bowtie Antenna');

% Welch Power Spectral Density Estimate
figure(2);
%input,segment length,overlapped samples,DFT points,sample rate
pwelch(sqrt(9000*Fr/50)*vi,[],[], [], Fs); 
ylabel('Power (dBm)');