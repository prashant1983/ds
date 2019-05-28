package com.mycompany.core.overloading;

public class Account {

	public void printAccount(Object data) {
		System.out.println("Account Details by Object ");
	}

	/*public void printAccount(String data) {
		System.out.println("Account Details by String ");

	}*/
	
	public void printAccount(SavingsAccount sb) {
		System.out.println("Account Details by String Buffer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		account.printAccount(null);

	}

}
