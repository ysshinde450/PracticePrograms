package overloadingPro;

public class Super {

	public static void m1(int a){		
		System.out.println("Super m1");
	}
	
	 static public void main(String[] args) {
		m1(5);
	}
}