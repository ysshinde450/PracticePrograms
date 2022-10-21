package simplePrograms;

public class PrimeNumberSeries1to100 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=100;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(i+" ");
			
		}
	}
	
}
//  2 3 5 7 11 13 17 19 23 31 37