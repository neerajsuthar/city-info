package caller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.sampleapi.exception.FetcherBaseException;

import caller.news.FetchNews;


public class FetchCityInfoServletTest {

	private FetchCityInfoServlet serv;
	
	@Before
	public void setUp(){
		serv = new FetchCityInfoServlet();
	}


	@Test
	public void testGetWeather() throws FetcherBaseException {
		
		System.out.println(serv.getWeather("Bangalore"));

		assertTrue(true);
	}	
	
	
	@Test
	public void testGetNews() throws FetcherBaseException {

		List<String> response = serv.getNews("Bangalore");
		for(String s : response){
			System.out.println(s);
		}
		assertNotNull(response);
	}
}
