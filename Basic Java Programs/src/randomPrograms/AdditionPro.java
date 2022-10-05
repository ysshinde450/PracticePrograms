package randomPrograms;

import java.util.Scanner;

public class AdditionPro {
		
	public static void main(String[] args) {
			 
		int c;
		Scanner scan=new Scanner(System.in);
		c=scan.nextInt();
		if(c%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
		scan.close();
		}
	
}
