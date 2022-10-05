package simplePrograms;

public class StringUpperAndLower {

	public static void main(String[] args) {

		String s = "Welcome To India";
		String lower = "";
		String upper = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper = upper + ch;
			} else
				lower = lower + ch;
		}
		System.out.println("upper letters are " + upper);
		System.out.println("lower letter are " + lower);
	}
}