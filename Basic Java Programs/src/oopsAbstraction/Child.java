package oopsAbstraction;

public class Child extends Parent {
		
	public static void main(String[] args) {
		Child var=new Child();
		var.m1();
	}

	@Override
	public  void m1() {

System.out.println("Abstract method execution");
		
	}
}