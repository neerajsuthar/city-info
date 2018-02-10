package com.sampleapi.weather.datafetcher;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.weather.entities.WeatherData;

public interface WeatherInfoFetcher {
	
	WeatherData getWeatherAt(String city) throws FetcherBaseException;

}

// add this to code review checklist