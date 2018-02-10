package com.sampleapi.weather.entities;

public class Query {
	private Results results;

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}
	
	@Override
	public String toString() {
		String s = ""+results;
		return s;
	}
}
