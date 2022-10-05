package Practices;

public class Fibonacci1 {

	public static void main(String[] args) {
		int a=0; int b=1; int c=10;int d=0;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<=c; i++) {
				d=a+b;
				System.out.print(d+" ");
				a=b;
				b=d;			
		}
	}
}