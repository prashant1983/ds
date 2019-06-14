package com.mycompany.core.threads;

public class MyTask extends Thread {

	MyTask(ThreadGroup threadGroup, String threadname) {

		super(threadGroup, threadname);
	}

	@Override
	public void run() {

		System.out.println("My new task===>" + Thread.currentThread());

	}

	public static void main(String args[]) throws InterruptedException {
		// create thread
		ThreadGroup tg1 = new ThreadGroup("Group A");  
		MyTask myTask = new MyTask(tg1,"Mytask");
		
		myTask.setPriority(10);
		
		myTask.start();
		myTask.join();

		System.out.println("Hello Main===>>" + Thread.currentThread());
	}
}
