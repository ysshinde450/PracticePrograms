package tryingNewPrograms;

public class FibonacciSeries { //without recursion.
	
	static int a=0, b=1, e;
	
	public static void FibonacciRecursion(int c) {
		if(c>0) {
			e=a+b; //e8 a3 b5 
			a=b; //e8 a5 b5
			b=e; //e8 a5 b8
			System.out.println(e); //1 2 3 5 8
			FibonacciRecursion(c-1); //4 3 2 1 0
		}
	}
	public static void main(String[] args){
		int c=10;
		System.out.println(a+" "+b); // c6 a0 b1
		FibonacciRecursion(c-1); //c5 
	}
}

//0 1 1