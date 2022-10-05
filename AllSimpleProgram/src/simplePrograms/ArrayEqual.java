package simplePrograms;

import java.util.Arrays;

public class ArrayEqual {
	
	public static void main(String[] args) {
		int[] a= {5,7,3,1,7,5,2,4};
		int[] c= {5,7,3,1,7,5,2,4};
		int[] d= {15,3,1,7,5,2,4};
		
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(a, d));
	}
}