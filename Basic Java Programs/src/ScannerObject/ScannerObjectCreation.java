package ScannerObject;

import java.util.Scanner;

public class ScannerObjectCreation {
	
   public static void main(String[] args) {
		int a;
		int b, c;
		Scanner var= new Scanner(System.in);
		System.out.print("Print first number ");
		a=var.nextInt();
		System.out.print("Print second number ");
		b=var.nextInt();
		c=a+b;
		System.out.print("Add both numbers "+c);
		var.close();  
	}
}