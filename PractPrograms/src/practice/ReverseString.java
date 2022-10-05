package practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "Yogesh";
		String res = "";
		for(int i=s.length()-1;i>=0;i--) {
			res = res+ s.charAt(i);
		}
		System.out.println("Reverse String "+res);
	}
}