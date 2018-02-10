package com.sampleapi.weather.entities;

public class Condition {
	private String date;
	private String temp;
	private String text;
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	/*public String getTemp() {
		x = Double.parseDouble(temp);
		 x=(x-32)*(0.5556); 
		return ""+x ;
	}


	public void setTemp(String temp) {
		x = Double.parseDouble(temp);
		 x=(x-32)*(0.5556); 
		this.temp = ""+x;
	}
*/

	public String getText() {
		return text;
	}


	public String getTemp() {
		return temp;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		String s = "\nTemperature : "+temp+" F";
		s += "\nText : "+text;
		s += "\nDate : "+date;
		return s;
	}
}
