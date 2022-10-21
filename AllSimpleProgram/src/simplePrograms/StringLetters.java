package simplePrograms;

public class StringLetters {
	
	public static void main(String[] args) {
		String s= "India is my country!!! 123 ";
		System.out.println(s.length());
		
		s=s.replaceAll("[a-zA-z0-9]","");
		s=s.replaceAll(" ", "");
		System.out.println(s);
		
	}
}