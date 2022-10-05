package reverseString;

public class ReverseString {
	
	public static void main(String[] args) {

		 System.out.println(reverseString("YOGESH"));  		      
	}

	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	} 
}
