package com.sampleapi.news.datafetcher;


import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.exception.FetcherConnectionException;
import com.sampleapi.news.entities.NewsData;

public class ToiNewsFetcher implements NewsFetcher {
	
	/**
	 * Fetches headlines and links to articles from Times Of India for <tt>city</tt>.
	 * @param city represents the city for which news stories are requested.
	 * @return news data for location determined by <tt>city</tt>
	 * @throws FetcherBaseException 
	 */
	public NewsData getNewsAt(String city) throws FetcherBaseException {
		String jsonData = getRawJson(city);
		NewsData newsData = parseJson(jsonData);
		return newsData;
	}

	private String getRawJson(String city) throws FetcherBaseException {

		//TODO Neeraj: What does "ResourceBundle Abstraction" mean?
		// ResourceBundle Abstraction
		ResourceBundle config = ResourceBundle.getBundle("bundles.config");
		String url = MessageFormat.format(config.getString("TMS_API_URL"),config.getString(city));
		
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
		catch (Exception e) {
			
			throw new FetcherBaseException("UNKNOWNERR", e.getMessage());
		}
		
		return response.getBody();
	}

	private NewsData parseJson(String rawJson) {
		
		return new Gson().
				fromJson(rawJson, NewsData.class);
	}
}
