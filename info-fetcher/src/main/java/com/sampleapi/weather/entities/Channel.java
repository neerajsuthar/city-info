package com.sampleapi.weather.entities;

public class Channel {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		String s = ""+item;
		return s;
	}
}

