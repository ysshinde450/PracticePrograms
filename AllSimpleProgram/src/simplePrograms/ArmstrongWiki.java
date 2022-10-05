package simplePrograms;
import java.util.Scanner;

public class ArmstrongWiki {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		double sum = requiredSum(num);
		if (num == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

	public static int noOfDigits(int num) {
		int i;
		for (i = 0; num > 0; i++) {
			num /= 10;
		}
		return i;
	}

	public static double requiredSum(int num) {
		int i = noOfDigits(num);
		double sum = 0;
		while (num > 0) {
			int digit = num % 10;
			num /= 10;
			sum += Math.pow(digit, i);
		}
		return sum;
	}

}
