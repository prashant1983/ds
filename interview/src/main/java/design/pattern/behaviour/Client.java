package design.pattern.behaviour;

public class Client {

	public static void main(String[] args) {
		ONewsAgency observable = new ONewsAgency();
		NewsChannel observer = new NewsChannel();
		observable.addObserver(observer);
		observable.setNews("Good  Morning");
		// assertEquals(observer.getNews(), "news");

	}

}
