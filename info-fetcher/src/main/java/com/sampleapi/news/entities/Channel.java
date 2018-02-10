package com.sampleapi.news.entities;

import java.util.List;

public class Channel {
	private String title;
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		String s = "NEWS : "+title;
		for(Item i : item){
			s+= ""+i;
		} 
		return s;
	}
	

}

