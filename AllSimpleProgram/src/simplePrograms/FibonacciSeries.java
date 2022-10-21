package simplePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=10;
		int a=0; int b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}