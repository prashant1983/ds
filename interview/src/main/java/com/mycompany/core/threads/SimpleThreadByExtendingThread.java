package com.mycompany.core.threads;

public class SimpleThreadByExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create thread
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("Here goe's my task");

			}
		});
		
		t.start();
		System.out.println("Before thread call===>>");
		
		

	}

}
