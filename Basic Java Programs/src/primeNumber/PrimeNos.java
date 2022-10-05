package primeNumber;

public class PrimeNos {
	public static void main(String args[]) { // m-b fla-c n-d
		int i, b = 0, c = 0, d = 12;
		b = d / 2;
		if (d == 0 || d == 1) {
			System.out.println(d + " is not a prime number.");
		} else {
			for (i = 2; i <= b; i++) {
				if (d % i == 0) {
					System.out.println(d + " is not a prime number.");
					c = 1;
					break;
				}
			}
			if (c == 0) {
				System.out.println(d + " is a prime number.");
			}
		}
	}
}