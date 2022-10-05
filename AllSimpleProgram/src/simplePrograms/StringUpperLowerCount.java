package simplePrograms;

public class StringUpperLowerCount {

	public static void main(String[] args) {

		String s = "Welcome To India";
		int lower = 0;
		int upper = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
			} else
				lower++;
		}
		System.out.println("upper count is " + upper);
		System.out.println("lower count is " + lower);
	}
}