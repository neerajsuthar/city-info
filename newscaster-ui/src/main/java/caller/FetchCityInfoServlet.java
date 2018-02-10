package caller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.RequestDirector;

import com.sampleapi.exception.FetcherBaseException;

import caller.news.FetchNews;
import caller.weather.FetchWeather;

/**
 * Servlet implementation class FetchCityInfoServlet
 */

public class FetchCityInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchCityInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		
		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
		String cityName = (String) request.getParameter("cityList");
		
		try {
			request.setAttribute("wthr", getWeather(cityName));
			request.setAttribute("news", getNews(cityName));
			request.setAttribute("cityList", cityName);
		} catch (Exception e) {
			out.println("<h2>Fetcher Base Exception Occured...</h2>");

		}
		disp.forward(request, response);
		
		
	}
	
	public String getWeather(String cityName) throws FetcherBaseException{
		FetchWeather weather = new FetchWeather();
		return weather.getWeather(cityName);
		//return cityName + "'s weather is nice";
	}
	
	public List<String> getNews(String cityName) throws FetcherBaseException{
		FetchNews news = new FetchNews();
		return news.getNews(cityName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
