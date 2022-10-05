package Practices;

public class Test3 {
	
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		for(int i=2;i<=a/2;++i) {
			if(a%i==0) {
			b=1;
			break;
			}
		}
		if(b==0) {
			System.out.println("Prime number");
		}
		else
			System.out.println("Not a Prime number");
	}
}