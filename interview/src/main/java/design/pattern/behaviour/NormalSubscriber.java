package design.pattern.behaviour;

import java.util.Observable;
import java.util.Observer;

public class NormalSubscriber implements Observer {

	private String message;

	public void update(Observable arg0, Object arg1) {
		this.setMessage((String) arg1);
		printMessage();

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// log message once received
	public void printMessage() {

		System.out.println("PrimiumSubscriber Message Received===>>" + this.getMessage());
	}

}
