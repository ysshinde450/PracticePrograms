package practiceProgram;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int a=11;
		if((a%1==0)&&(a%a==0)) {
			if(a%2==0) {
				System.out.println("Prime number");
			}
			else
				System.out.println("Not Prime number");
					}
		else
			System.out.println("Not Prime number");
	}

}
