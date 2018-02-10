package com.sampleapi.weather.datafetcher;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.weather.entities.WeatherData;

public class YahooWeatherInfoFetcherTest {
	
	private WeatherInfoFetcher weather;
	
	private String getCurrentTestName() {
		StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
    	return trace.getMethodName();
	}

	
    @Before
	public void setUp() {
		
		weather = new YahooWeatherInfoFetcher();
	}


	@Test
    public void testGetWeather_Bangalore() throws FetcherBaseException {
        
    	System.out.println("************* OUTPUT FROM " +getCurrentTestName()+" *************");
    	WeatherData wdata = weather.getWeatherAt("Bangalore");
    	System.out.println(wdata);
        assertNotNull(wdata);
    }
    
    @Test
    public void testGetWeather_Dubai() throws FetcherBaseException {
    	
    	System.out.println("************* OUTPUT FROM " +getCurrentTestName()+" *************");
    	WeatherData wdata = weather.getWeatherAt("Dubai");
    	System.out.println(wdata);
        assertNotNull(wdata);
    }
    
    @Test (expected=FetcherBaseException.class)
    public void testGetWeather_InvalidSpecialChars() throws FetcherBaseException {
    	
    	System.out.println("************* OUTPUT FROM " +getCurrentTestName()+" *************");
    	WeatherData wdata = weather.getWeatherAt("ASDF@@!!^&*");
    	System.out.println(wdata);
        assertNotNull(wdata);
    }
    
    @Test
    public void testGetWeather_Mumbai() throws FetcherBaseException {
    	
    	System.out.println("************* OUTPUT FROM " +getCurrentTestName()+" *************");
        WeatherData wdata = weather.getWeatherAt("Mumbai");
        System.out.println(wdata);
        assertNotNull(wdata);
    }
}