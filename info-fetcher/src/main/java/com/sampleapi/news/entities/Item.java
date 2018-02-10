package com.sampleapi.news.entities;

public class Item {
	private String title;
	private String link;
	private String pubDate;

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getPubDate() {
		return pubDate;
	}


	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}


	@Override
	public String toString() {
		String s = "\n-------------------------------";
		s += "\nTitle : "+title;
		s += "\nPublished on : "+pubDate;
		s += "\nLink : "+link;
		return s;
	}

}
