package design.pattern.behaviour;

import java.util.Observable;

public class ONewsAgency extends Observable {
	private String news="Good Morning";

	public void setNews(String news) {
		this.news = news;
		setChanged();
		notifyObservers(news);
		
	}
}