package com.mycompany.core.overloading;

import java.util.Scanner;

/**
 * Simple Java program to print prime numbers from 1 to 100 or any number. A
 * prime number is a number which is greater than 1 and divisible by either 1 or
 * itself.
 */
public class PrimeNumberExample {
	public static void main(String args[]) {
      
       //get input till which prime number 
       //to be printed
        System.out.println("Enter the number till which prime number to be printed: ");
        int limit = new Scanner(System.in).nextInt();
    
        //printing primer numbers till the limit 
        //( 1 to 100)
        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number<=limit; number++){
        	
        	if(number % 2 == 0) {
        		
        	}else {
        		System.out.println(number);
        	}
        	
        	
            //print prime numbers only
           /* if(isPrime(number)){
                System.out.println(number);
            }*/
        }
    }

	/*
	 * Prime number is not divisible by any number other than 1 and itself
	 * 
	 * @return true if number is prime if (number % 2 == 0) return false; for (int i
	 * = 3; i < Math.sqrt(n); i+=2) if (number % i == 0) return false; return true;
	 */
	public static boolean isPrime(int number) {
		// for(int i=2; i<number; i++)
		
		
		
		
		if (number % 2 == 0) {
			return false;
			// number is divisible so its not prime
		}
		for (int i = 3; i < number/*Math.sqrt(number)*/; i++) {
			if (number % i == 0) {
				return false; // number is
				// divisible so its not prime
			}
		}
		return true; // number is prime now
	}
}
