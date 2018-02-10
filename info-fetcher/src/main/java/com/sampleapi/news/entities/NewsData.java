package com.sampleapi.news.entities;

public class NewsData {
	private Channel channel;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	@Override
	public String toString() {
		String s = "---***---NEWS CHANNEL---***---\n"+channel;
		return s;
	}

}
