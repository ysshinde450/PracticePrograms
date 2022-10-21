package simplePrograms;

public class GetNumbersFromString {

	public static void main(String[] args) {
		String str= "sd1f3sd4d5fg46sdfdfsdf4 54f35fdfsfdsefas";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);

	}
}
