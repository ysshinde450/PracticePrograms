package practiceProgram;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fromConsole=sc.nextInt();
		int input=fromConsole;
		int rem=0;
		int reverse=0;
		
		while(input!=0) {
		
			rem=input%10;
			reverse=reverse*10+rem;
			input=input/10;
		}
		
		if(fromConsole==reverse) {
			System.out.println(" is a Pallindrome number");
		}
		else {
			System.out.println("is not a Pallindrome number");
		}
	}

}
