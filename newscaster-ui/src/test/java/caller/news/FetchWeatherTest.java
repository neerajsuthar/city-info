package caller.news;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sampleapi.exception.FetcherBaseException;

import caller.weather.FetchWeather;


public class FetchWeatherTest {

	@Test
    public void testGetWeather() throws FetcherBaseException {
    	FetchWeather fWeather = new FetchWeather();
    	String response = fWeather.getWeather("Bangalore");
    	System.out.println(response);
    	assertNotNull(response);
    }
}
