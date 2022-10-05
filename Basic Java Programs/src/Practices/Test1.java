package Practices;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = "";

		for (int a = s.length()-1 ; a >= 0; a--) {
			rev = rev + (s.charAt(a));
		}

		if (rev.equalsIgnoreCase(s))
			System.out.println(s + " is a palindrome String");
		else
			System.out.println(s + " is not a palindrome String");
	}

}