package com.sampleapi.weather.datafetcher;

import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.exception.FetcherConnectionException;
import com.sampleapi.weather.entities.WeatherData;

public class YahooWeatherInfoFetcher implements WeatherInfoFetcher {
	
	/**
	 * Fetches the weather information at the location indicated by 
	 * <tt>city</tt> from the Yahoo! Weather API.
	 * 
	 * @param city represents the name of the city for which weather is requested.
	 * @return Weather information at the location.
	 * @throws FetcherBaseException
	 * @throws InterruptedException 
	 */
	public WeatherData getWeatherAt(String city) throws FetcherBaseException {
		String jsonData = getRawJson(city);
		/*for(int count = 0; jsonData.endsWith("\"results\":null}}") && count<10; count++)
			try {
				{
					
					System.out.println("Retrying...");
					jsonData = getRawJson(city);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		WeatherData weatherData = parseJson(jsonData);
		return weatherData;
	}

	private String getRawJson(String city) throws FetcherBaseException {
		
		ResourceBundle config = ResourceBundle.getBundle("bundles.config");
		String url = MessageFormat.format(config.getString("YAHOO_API_URL"),city);

		HttpResponse<String> response = null;
		try {
			response = Unirest.get(url).asString();
		}
		catch (UnirestException e) {

			if (e.getCause() instanceof UnknownHostException) {
				throw new FetcherConnectionException("CONNEXCP_001",e.getMessage());
			}
			else {
				throw new FetcherBaseException("UNKNOWNUNI", e.getMessage());
			}
		}
		catch (RuntimeException e) {
			
			if (e.getCause() instanceof URISyntaxException) {
				throw new FetcherBaseException("INVALIDCHARS", ""+e.getMessage());
			}
			else {
				throw new FetcherBaseException("UNKNOWNERR", ""+e.getMessage());
			}
		}
		catch (Exception e) {
			
			throw new FetcherBaseException("UNKNOWNERR", ""+e.getMessage());
		}
		
		return response.getBody();
	}

	private WeatherData parseJson(String rawJson) {
		
		return new Gson()
				.fromJson(rawJson, WeatherData.class);
	}
}
