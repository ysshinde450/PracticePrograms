package simplePrograms;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int num = 13;
		boolean b=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("This is prime number");
		}
		else
			System.out.println("This is not a prime number");
	}

}