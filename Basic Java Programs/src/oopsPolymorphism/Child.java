package oopsPolymorphism;

public class Child extends Parent {

	public static void m1() {
		System.out.println("m1 child");
	}

	public static void m1(int a) {
		System.out.println("m1 child arguments");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		
	}
}