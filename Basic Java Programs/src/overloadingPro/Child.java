package overloadingPro;

public class Child extends Super {
	
	public void m1() {
		System.out.println("child m1");
	}
	
	public static void main(String[] args) {
		Super refVariable=new Child();
		refVariable.m1(5);
	}
}