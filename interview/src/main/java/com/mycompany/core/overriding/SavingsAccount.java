package com.mycompany.core.overriding;

import java.io.FileNotFoundException;

public class SavingsAccount extends Account {
	@Override
	public void printAccount(Object data) throws FileNotFoundException{

		System.out.println("Saving Account");
	}

	public static void main(String args[]) throws Exception {

		Account sa = new SavingsAccount();
		sa.printAccount("Prashant Gs");

	}

}
