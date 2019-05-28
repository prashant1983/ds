package design.pattern.behaviour;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

	private String news;

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stubs
		this.setNews((String) arg1);

	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		
		System.out.println("News arrived ! message for now is ===>>"+news);
		this.news = news;
	}

}
