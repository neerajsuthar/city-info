package com.sampleapi.news.datafetcher;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.news.datafetcher.ToiNewsFetcher;
import com.sampleapi.news.entities.NewsData;

public class ToiNewsFetcherTest {

	
	//String blrJson = "{\"query\":{\"count\":1,\"created\":\"2017-01-17T10:27:57Z\",\"lang\":\"en-US\",\"results\":{\"channel\":{\"units\":{\"distance\":\"mi\",\"pressure\":\"in\",\"speed\":\"mph\",\"temperature\":\"F\"},\"title\":\"Yahoo! Weather - Bengaluru, KA, IN\",\"link\":\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2295420/\",\"description\":\"Yahoo! Weather for Bengaluru, KA, IN\",\"language\":\"en-us\",\"lastBuildDate\":\"Tue, 17 Jan 2017 03:57 PM IST\",\"ttl\":\"60\",\"location\":{\"city\":\"Bengaluru\",\"country\":\"India\",\"region\":\" KA\"},\"wind\":{\"chill\":\"81\",\"direction\":\"45\",\"speed\":\"14\"},\"atmosphere\":{\"humidity\":\"30\",\"pressure\":\"912.0\",\"rising\":\"0\",\"visibility\":\"16.1\"},\"astronomy\":{\"sunrise\":\"6:46 am\",\"sunset\":\"6:14 pm\"},\"image\":{\"title\":\"Yahoo! Weather\",\"width\":\"142\",\"height\":\"18\",\"link\":\"http://weather.yahoo.com\",\"url\":\"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif\"},\"item\":{\"title\":\"Conditions for Bengaluru, KA, IN at 02:30 PM IST\",\"lat\":\"12.97754\",\"long\":\"77.59951\",\"link\":\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2295420/\",\"pubDate\":\"Tue, 17 Jan 2017 02:30 PM IST\",\"condition\":{\"code\":\"32\",\"date\":\"Tue, 17 Jan 2017 02:30 PM IST\",\"temp\":\"81\",\"text\":\"Sunny\"},\"forecast\":[{\"code\":\"32\",\"date\":\"17 Jan 2017\",\"day\":\"Tue\",\"high\":\"81\",\"low\":\"57\",\"text\":\"Sunny\"},{\"code\":\"32\",\"date\":\"18 Jan 2017\",\"day\":\"Wed\",\"high\":\"81\",\"low\":\"57\",\"text\":\"Sunny\"},{\"code\":\"34\",\"date\":\"19 Jan 2017\",\"day\":\"Thu\",\"high\":\"77\",\"low\":\"54\",\"text\":\"Mostly Sunny\"},{\"code\":\"30\",\"date\":\"20 Jan 2017\",\"day\":\"Fri\",\"high\":\"81\",\"low\":\"55\",\"text\":\"Partly Cloudy\"},{\"code\":\"28\",\"date\":\"21 Jan 2017\",\"day\":\"Sat\",\"high\":\"79\",\"low\":\"61\",\"text\":\"Mostly Cloudy\"},{\"code\":\"30\",\"date\":\"22 Jan 2017\",\"day\":\"Sun\",\"high\":\"81\",\"low\":\"64\",\"text\":\"Partly Cloudy\"},{\"code\":\"28\",\"date\":\"23 Jan 2017\",\"day\":\"Mon\",\"high\":\"81\",\"low\":\"62\",\"text\":\"Mostly Cloudy\"},{\"code\":\"28\",\"date\":\"24 Jan 2017\",\"day\":\"Tue\",\"high\":\"81\",\"low\":\"62\",\"text\":\"Mostly Cloudy\"},{\"code\":\"12\",\"date\":\"25 Jan 2017\",\"day\":\"Wed\",\"high\":\"75\",\"low\":\"61\",\"text\":\"Rain\"},{\"code\":\"11\",\"date\":\"26 Jan 2017\",\"day\":\"Thu\",\"high\":\"68\",\"low\":\"60\",\"text\":\"Showers\"}],\"description\":\"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/32.gif\"/>\n<BR />\n<b>Current Conditions:</b>\n<BR />Sunny\n<BR />\n<BR />\n<b>Forecast:</b>\n<BR /> Tue - Sunny. High: 81Low: 57\n<BR /> Wed - Sunny. High: 81Low: 57\n<BR /> Thu - Mostly Sunny. High: 77Low: 54\n<BR /> Fri - Partly Cloudy. High: 81Low: 55\n<BR /> Sat - Mostly Cloudy. High: 79Low: 61\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2295420/\">Full Forecast at Yahoo! Weather</a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel</a>)\n<BR />\n]]>\",\"guid\":{\"isPermaLink\":\"false\"}}}}}}";
	
    @Test
    public void testGetRawJson() throws FetcherBaseException {
        ToiNewsFetcher news = new ToiNewsFetcher();
        //String response = news.getRawJson("Delhi");
        NewsData ndata = news.getNewsAt("Mumbai");
        System.out.println(ndata.toString());
        //System.out.println(response);
        assertNotNull(ndata);
    }
}

