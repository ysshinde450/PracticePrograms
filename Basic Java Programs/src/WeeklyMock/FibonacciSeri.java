package WeeklyMock;

public class FibonacciSeri {
	
	public static void main(String[] args) {
		int a=0; 	int b=1;
		int c=0;
		int d=10;
		System.out.print(a+" "+b);
		
		for(int i=2;i<=d;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}