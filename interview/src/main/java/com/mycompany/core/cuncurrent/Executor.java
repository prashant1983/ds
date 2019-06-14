package com.mycompany.core.cuncurrent;

public class Executor implements java.util.concurrent.Executor {

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub

		command.run();
	}

	public static void main(String args[]) {

		Runnable t = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task");

			}
		};
		Executor executor = new Executor();
		executor.execute(t);

	}
}
