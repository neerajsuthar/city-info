package caller.weather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import com.sampleapi.exception.FetcherBaseException;

import caller.news.FetchNews;

public class FetchNewsTest {
	
	@Test
    public void testGetNews() throws FetcherBaseException {
    	FetchNews fNews = new FetchNews();
    	String time = "12:30 PM";
    	
    	List<String> response = fNews.getNews("Mumbai");
    	for(String s : response){
    		System.out.println(s);
    	}
    	assertNotNull(response);
    }
}
