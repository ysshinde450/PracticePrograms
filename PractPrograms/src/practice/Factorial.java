package practice;

public class Factorial {
	
	public static void main(String[] args) {
		int a = 10;
		int res = 1;
		
		for(int i=a;i>=1;i--)
			res = res * i;
		System.out.println(res);
	}

}
