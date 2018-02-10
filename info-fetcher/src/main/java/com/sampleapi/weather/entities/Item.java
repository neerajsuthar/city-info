package com.sampleapi.weather.entities;

public class Item {
	private String title;
	private Condition condition;
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		String s = "Title : "+title;
		s += condition;
		return s;
	}
}
