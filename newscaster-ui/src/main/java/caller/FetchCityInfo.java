package caller;


import com.sampleapi.exception.FetcherBaseException;

import caller.news.FetchNews;
import caller.weather.FetchWeather;

public class FetchCityInfo {

	public void fetchCityDetailsFromFetcher(String cityName) throws FetcherBaseException{
		
		FetchNews news = new FetchNews();
		FetchWeather weather = new FetchWeather();

		news.getNews(cityName);
		weather.getWeather(cityName);		

	}

}