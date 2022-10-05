package Practices;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args){
				
		Scanner var= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=var.nextInt();
		System.out.println("Enter second number: ");
		int b=var.nextInt();
		
		int c=a+b;
		
		System.out.println("Addition of both the numbers: "+c);
	}

}