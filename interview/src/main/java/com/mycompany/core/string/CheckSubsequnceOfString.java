package com.mycompany.core.string;

public class CheckSubsequnceOfString {

	public static boolean isSubsequence(String s1, String s2) {

		int l1 = s1.length() - 1;
		int l2 = s2.length() - 1;

		int count = -1;
		for (int i = l1; i >= 0; i--) {

			for (int j = l2; j >= 0; j--) {

				if (s1.charAt(i) == s2.charAt(j)) {
					count++;
					l2--;
					break;

				}

			}

		}
		return count == l1 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("AXYZ", "ADXCPY"));

	}

}
