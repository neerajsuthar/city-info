package com.sampleapi.news.datafetcher;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.news.entities.NewsData;

public interface NewsFetcher {
	
	NewsData getNewsAt(String city) throws FetcherBaseException;
}