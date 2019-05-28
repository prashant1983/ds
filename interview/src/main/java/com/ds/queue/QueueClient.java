package com.ds.queue;

/**
 * 
 * @author prashant
 *
 */
public class QueueClient {

	public static void main(String[] args) throws Exception {
		QueueImpl queueImpl = new QueueImpl();

		queueImpl.enqueue("James");
		queueImpl.enqueue("Dennies Ritche");
		queueImpl.enqueue("Rod Jhonson");
		queueImpl.enqueue("Charls Babbage Mahashaya");
		queueImpl.enqueue("PrashantGs");
		System.out.println("Before Dequeue");
		queueImpl.show();
		// queueImpl.dequeue();
		// queueImpl.dequeue();

		queueImpl.dequeue();
		System.out.println("After Dequeue");

		queueImpl.show();
		System.out.println("Size of Queue==>" + queueImpl.size());

	}

}
