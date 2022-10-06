package com.JavaTutorialOneShot.javabasiccodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringLargest {
	
	public static String ArrayChallenge(String[] string) {
		 HashMap<Integer, ArrayList<String>> words_length = new HashMap<Integer, ArrayList<String>>();
	      
			for (String word : string) {
	            int length = word.length();
	            if (words_length.containsKey(length)) {
	                words_length.get(length).add(word);
	            } else {
	                ArrayList<String> temp = new ArrayList<String>();
	                temp.add(word);
	                words_length.put(length, temp);
	            }
	        }
	        Object keys[] = words_length.keySet().toArray();
	        Integer sorted[] = new Integer[words_length.size()];
	        for (int x = 0; x < keys.length; x++) {
	            sorted[x] = (Integer)keys[x];
	        }
	        Arrays.sort(sorted);
	        ArrayList<String> results = new ArrayList<String>();
	        for (int x = sorted.length - 1; x >= 0; x--) {
	            ArrayList<String> temp = words_length.get(sorted[x]);
	            for (String word : temp) {
	                results.add(word);
	            }
	        }
		return string[1];
		
	}
	
	public static void main(String[] args) {
		 	String[] s = {"hello", "world", "before", "all"};
		 	//Scanner s = new Scanner(System.in);
	        System.out.println(ArrayChallenge(s));
	}

}
