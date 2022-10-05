package Pallindromepack;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		int t = s.length();
		int rem, rev = 0;
		String str = s;
		while (t != 0) {
			rev = rev + s.charAt(t);
		}
		if (str.equals(str)) {
			System.out.println("palindrome");
		} else
			System.out.println("not a palindrome");
	}
}