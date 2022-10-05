package practiceOperators;

public class IncrementOperators {

	public static void main(String[] args) {
		int a = 5; int b = 3;		
		a=++b; // b=3+1 a=4 
		a=b++; // b=4+1 a=4 (as it is 4 due to post increment)
		System.out.println(a); 
		System.out.println(b); 
		b=++a; // a=4+1 b=5
		b=a++; // a=5+1 b 5 (as it is 5 due to post increment)
		System.out.println(a); // 6
		System.out.println(b); // 5
		a=--b; // b=5-1 a=4 
		a=b--; // b=4-1 a=4 (as it is 4 due to post decrement)
		System.out.println(a); // 4
		System.out.println(b); // 3
		b=--a; // a=4-1 b=3
		b=a--; // a=3-1 b 3 (as it is 5 due to post decrement)
		System.out.println(a); // 2
		System.out.println(b); // 3		
	}
}
