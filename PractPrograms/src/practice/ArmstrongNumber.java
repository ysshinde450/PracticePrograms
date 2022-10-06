package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	//Git bash changed
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=a;
		int rem, rev=0;
		while(a!=0) {
			rem = a%10;
			int e=(int) Math.pow(rem, a);
			rev = e+rev;
			a/=10;
		}
		System.out.println(rev);
		if(b==rev)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}
}