package com.sampleapi.weather.entities;

public class WeatherData {

	private Query query;

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}
	 
	@Override
	public String toString() {
		String s = "***----------TEMPERATURE SERVICE----------***\n"+query;
		return s;
	}
	

}
