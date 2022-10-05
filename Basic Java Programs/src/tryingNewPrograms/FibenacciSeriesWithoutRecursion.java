package tryingNewPrograms;
//Fibonacci Series without Recursion
public class FibenacciSeriesWithoutRecursion {
	
	public static void main(String[] args) {
		int a=0, b=1, d, e=8;
		System.out.println(a);
		System.out.println(b);
		for(int c=1;c<e;++c) {
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
			}
		}
}