package caller.news;

import java.util.ArrayList;
import java.util.List;

import com.sampleapi.exception.FetcherBaseException;
import com.sampleapi.news.datafetcher.NewsFetcher;
import com.sampleapi.news.datafetcher.ToiNewsFetcher;
import com.sampleapi.news.entities.Item;
//TODO Natasha: class names should always be: A. A noun, B. A verb
public class FetchNews {
	
	public List<String> getNews(String city) throws FetcherBaseException{
		
		NewsFetcher newsFetcher = new ToiNewsFetcher();
		
		List<String> newsList = new ArrayList<String>();
		String subNews;
		
		for(Item item : newsFetcher.getNewsAt(city).getChannel().getItem()){
			subNews = "\nTitle : "+item.getTitle()+"<br>\nPublished on : "+item.getPubDate()+"<br>\nNews Link : "+"<a href=\""+item.getLink()+"\">"+item.getLink()+"</a>";
			newsList.add(subNews);
		}
		
		return newsList;
	} 
	
}
