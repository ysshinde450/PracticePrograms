package practice;

public class SortArrayInAnotherWay {

	static int[] a = { 10, 50, 75, 5, 7, 3, 6, 10, 1, 45 };
	int temp = 0;

	public void sortingArray() {
		System.out.println("sorting in ascending order");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Array before sorting");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		SortArrayInAnotherWay arrVar = new SortArrayInAnotherWay();
		arrVar.sortingArray();

		System.out.println("Array in descending order");
		for (int i = a.length - 1; i > 0; i--)
			System.out.print(a[i] + " ");
	}

}
//0 1 2 3 