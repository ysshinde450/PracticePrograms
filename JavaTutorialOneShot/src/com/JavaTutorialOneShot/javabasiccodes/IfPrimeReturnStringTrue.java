package com.JavaTutorialOneShot.javabasiccodes;

public class IfPrimeReturnStringTrue {

	public static boolean MathChallenge(int s) {
		int  i = 2;
	    boolean flag = false;
	    while (i <= s / 2) {
	      // condition for non-prime number
	      if (s % i == 0) {
	        flag = true;
	        break;
	      }
	      ++i;
	    }
	    
	    if (!flag) {
	      System.out.println(s);
	    	return true;}
	    else
	      System.out.println(s);
	    return false;
		
	}

	public static void main(String[] args) {
		int s = 15;
		System.out.println(MathChallenge(s));
	}
}