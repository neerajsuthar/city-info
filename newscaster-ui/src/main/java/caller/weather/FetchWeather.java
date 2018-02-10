package caller.weather;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.weather.datafetcher.WeatherInfoFetcher;
import com.sampleapi.weather.datafetcher.YahooWeatherInfoFetcher;

public class FetchWeather {
	
	WeatherInfoFetcher weather = new YahooWeatherInfoFetcher();
	String weatherDetails = "";
	public String getWeather(String city) throws FetcherBaseException {
		
		weatherDetails += "<br>\nTitle : "+getWeatherTitle(city);
		weatherDetails += "<br>\nDate : "+getWeatherDate(city);
		weatherDetails += "<br>\nTemp in F: "+getWeatherTempInFarenhiet(city);
		weatherDetails += "<br>\nTemp in C : "+getWeatherTempInCelcius(city);
		weatherDetails += "<br>\nText : "+getWeatherText(city);
		
		return weatherDetails;
	}

	public String getWeatherTitle(String city) throws FetcherBaseException {
		return weather.getWeatherAt(city).getQuery().getResults().getChannel().getItem().getTitle();
	}
	
	public String getWeatherTempInFarenhiet(String city) throws FetcherBaseException {
		return weather.getWeatherAt(city).getQuery().getResults().getChannel().getItem().getCondition().getTemp()+" F";
	}
	
	public String getWeatherTempInCelcius(String city) throws NumberFormatException, FetcherBaseException {
		double farenhietTemp=Double.parseDouble(weather.getWeatherAt(city).getQuery().getResults().getChannel().getItem().getCondition().getTemp());
		double celciusTemp = Math.round(((farenhietTemp-32)*((double)5/9))*100.00)/100.00;
		return celciusTemp+" C";
	}
	
	public String getWeatherText(String city) throws FetcherBaseException {
		return weather.getWeatherAt(city).getQuery().getResults().getChannel().getItem().getCondition().getText();
	}
	
	public String getWeatherDate(String city) throws FetcherBaseException {
		return weather.getWeatherAt(city).getQuery().getResults().getChannel().getItem().getCondition().getDate();
	}
}
