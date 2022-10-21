package simplePrograms;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s= "Yogesh Shinde";
		String res="";
		char ch;
		System.out.println("The string to reverse");
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--) { //first traversing
			ch=s.charAt(i); //extracting each character
			res=res+ch; // storing all extracted character in a veriable
		}
		System.out.println("Reverse string will be: \n"+res);
	}

}

