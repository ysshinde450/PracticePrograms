package practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
	
		int arr[]= {10,30,20,35,55,25};
		
		TreeSet set = new TreeSet();
		for(int var:arr) {
			set.add(var);
		}
		
		ArrayList list = new ArrayList(set);
		System.out.println("2nd largest element in array: "+list.get(list.size()-2));
		System.out.println("2nd lowest element in array: "+list.get(1));
	}

}
