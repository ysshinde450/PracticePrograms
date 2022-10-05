package practice;

public class CountingSpaceInStrings {
	
	public static void main(String[] args) {
		
		String s = "Yo ge sh Je eva n";
		int count=  0;
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println(count);			
	}
}