package com.sampleapi.weather.entities;

public class Results {
	
	
	private Channel channel;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	@Override
	public String toString() {
		String s = ""+channel;
		return s;
	}

}
