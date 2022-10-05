package practice;

import java.util.Scanner;

public class ArrayDupl {
	
	public static void main(String[] args) {
		int[] a = {2,5,5,5,6,6,7,8,9,9,9};
		int left=0;
		int right=a.length;
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		
		for(int i=0;i<=a.length;i++) {
			if(b==a[i]) {
				left=i;
				break;
			}
		}
		for(int i=a.length-1;i>=0;i--) {
			if(b==a[i]) {
				right=i;
				break;
			}
		}		
				System.out.println(left+","+right);
		}
}