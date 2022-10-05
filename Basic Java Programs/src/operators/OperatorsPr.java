package operators;

public class OperatorsPr {

	public static void method(){
		int a=0, b=1, d;
		int count=20;
		System.out.println(a);
		System.out.println(b);
		for(int c=1;c<count;++c) {
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
			
		}
	}
	 
	public static void main(String[] args) {
		method();
	}
}