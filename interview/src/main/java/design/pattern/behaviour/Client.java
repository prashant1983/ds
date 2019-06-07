package design.pattern.behaviour;

public class Client {

	public static void main(String[] args) {

		// observerable
		ONewsAgency agency = new ONewsAgency();

		// create observer

		NormalSubscriber channel = new NormalSubscriber();
		
		PrimiumSubscriber primiumSubscriber= new PrimiumSubscriber();

		agency.addObserver(channel);
		agency.addObserver(primiumSubscriber);

		// notify
		agency.setMessage("Good Night . Sweet Dreams !!");

	}

}
