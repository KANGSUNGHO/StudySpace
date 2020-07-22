package com.bit2020.chapter03.tv;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		power = on;
	}
	public void channel(int channel) {
		if(!power) {
			return;
		}
		if(channel < 1) {
			channel = 225;
		} else if(channel > 255) {
			channel = 1;
		}
		
		this.channel = channel;
	}
	public void channel(boolean up) {
		channel(channel +  (up ? 1: -1));
	}
	public void volume(int volume) {
		if(!power) {
			return;
		}
		if(volume < 0) {
			volume = 100;
		} else if(volume > 100) {
			volume = 0;
		}
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		volume(volume + (up ? 1: -1));
	}
	public void status() {
		System.out.println("TV[power= " + power + ", channel= " + channel + ", volum= " + volume +"]");
	}

}
