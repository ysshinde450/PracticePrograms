package primeNumber;

public class TryingPrime {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int a=2;a<=n;a++){ 
			int c=0;
			
			for(int b=2;b<a;b++) { 
				if(a%b==0) { 
					c++;  
				}
			}

			if(c==0) {
			System.out.print(a+" "); 
			}
			
		}
	}
}