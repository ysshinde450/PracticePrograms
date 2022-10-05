package Practices;

public class GetIntfromString {

	public static void main(String[] args) {
		String s="test234";
		
		String numberOnly=s.replaceAll("[^0-9]", "");
		
		System.out.println(numberOnly);

	}

}
