% Load vout1.mat from Simulink Model (Project 7)

clc, clear
% Call out to vin1.m file
%vin1;
% Load vout1.mat
vout1_wave = load('vout1.mat');
t = vout1_wave.vout1(1, :);
vo1 = vout1_wave.vout1(2, :);

h = t(2)-t(1);
Fs0 = 1/h;
nSize = size(t);
n = nSize(1,2);
nDiv = 1;
t0 = t(1:nDiv:n);
v0 = vo1(1:nDiv:n);
Fs = Fs0/nDiv;
Fr = (650/770)*Fs0*8/n;

% Bowtie Antena
figure(3);
plot(t(n-5000:n), vo1(n-5000:n));
xlabel('time (seconds)');
ylabel('Amplitude (Volt)');
title('Bowtie Antenna');

% Welch Power Spectral Density Estimate
figure(4);
% input,segment length,overlapped samples,DFT points,sample rate
pwelch(sqrt(1000*Fr/50)*vo1,[],[], [], Fs);
ylabel('Power (dBm)');
