package practice;

public class ReverseStringArray {

	public static String revString(String inp) {
		String rev = "";
		for (int j = inp.length() - 1; j >= 0; j--) {
			rev = rev + inp.charAt(j);
		}
		return rev;
	}

	public static void main(String[] args) {
			
		String str = "Yogesh ram shyam vadapav burger lemon";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length - 1; i++) {
			String str2 = str1[i];
			str1[i] = revString(str2);
		}
		for (int i = 0; i < str1.length - 1; i++) {
			System.out.print(str1[i] + " ");
		}
	}

}
