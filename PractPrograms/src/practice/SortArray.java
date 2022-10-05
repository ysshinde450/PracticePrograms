package practice;

import java.util.Arrays;

public class SortArray {

	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,4,5,45,4};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
