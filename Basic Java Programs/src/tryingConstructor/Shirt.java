package tryingConstructor;

public class Shirt {
	
	 String s;
	 char c;
	
	public Shirt(String setColor, char size) {
		c=size;
		s=setColor;
		System.out.println("My Shirt details: "+s+ " " +c);
	}

	public static void main(String[] args) {
		
	}
}
