package Array;

public class ArrayAscendingSwap {

	public static void main(String[] args) {
		int[] a = { 12, 13, 57, 50, 81, 564 };

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
				}
			}
			System.out.println(a[i]);
		}
	}
}