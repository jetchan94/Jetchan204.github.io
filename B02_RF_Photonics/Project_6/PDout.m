% Load PDout.mat from Simulink Model (Project 6)

clc, clear
% Call out to RFin.m file
RFin;
% Load PDout.mat
pdout_wave = load('PDout.mat');
t = pdout_wave.pdout(1,:);
pd = pdout_wave.pdout(2,:); 

h = t(2)-t(1);
Fs0 = 1/h;
nSize = size(t);
n = nSize(1,2);
nDiv = 1;
t0 = t(1:nDiv:n);
p0 = pd(1:nDiv:n);
Fs = Fs0/nDiv;
Fr = (650/770)*Fs0*8/n;

% Bowtie Antenna
figure(3);
plot(t(n-5000:n), pd(n-5000:n));
xlabel('time (seconds)');
ylabel('Amplitude (Volt)');
title('Bowtie Antenna'); 

% Welch Power Spectral Density Estimate
figure(4);
% input,segment length,overlapped samples,DFT points,sample rate
pwelch(350*pd,[],[], [], Fs);
ylabel('Power (dBm)');

% ---------------------------------------------------
% 1 Volt = 0dBm


% ------------------------------------------------------------------
% % x=pd, window=, noverlap=, nfft=t(2)-t(1)
% pwelch(pd,[],[], 1/((t(2)-t(1))));
% Welch PSD Estimate of Signal with Freuency in Hertz
% rng default
% 
% fs = 1000; % sample rate
% t = 0 : 1/fs : 5-1/fs; % 5 sec time duration 
% x = 2*sin(2*(pi/5)*(10*10^9)*t) + randn(size(t)); % 2-tone RF input?
% 
% [pxx,f] = pwelch(x,500,300,500,fs); 
% 