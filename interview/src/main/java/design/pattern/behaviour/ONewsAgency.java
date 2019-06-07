package design.pattern.behaviour;

import java.util.Observable;

public class ONewsAgency extends Observable {
	public void setMessage(String news) {
		setChanged();
		notifyObservers(news);

	}

}