package trycache;

public class Simple {
	
	public void m1() {
		
		System.out.println("Hi");
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(10/2);
		System.out.println(2/10);
		
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Error is "+e.getMessage());
		}finally {
			System.out.println("Any how will be executed");
		}
		System.out.println(0/10);
		Exception e = new Exception();
		Simple s = new Simple();
		s.m1();
		s.finalize();
		s.m1();
	}
}