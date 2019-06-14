package com.mycompany.core.string;

public class CheckFirstduplicateChar {

	public static Character printDuplicateChar(String s) {

		int l = s.length();

		char duplicateChar = ' ';

		for (int i = 1; i < l; i++) {

			for (int j = i + 1; j < l; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					duplicateChar = s.charAt(i);
					System.out.println("Duplicate char found==>>" + duplicateChar);
					return duplicateChar;

				}

			}

		}

		return duplicateChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateChar("Prashant");

	}

}
