package simplePrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=a;
		int d=(b+"").length();
		int e=0;
		int res=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			e=(int) Math.pow(rem, d);
			res=e+res;
			a=a/10;			
		}
		if(b==res)
		System.out.println("This is armstrong number");
		else
			System.out.println("This is not a armstrong number");
	}

}
