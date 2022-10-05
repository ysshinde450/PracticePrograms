package practiceProgram;

public class WArgsWReturn {
	
	int c=5;
	String d="hi";
	
	
	public String method(int a, int b) {
		
		System.out.println(d);
		return d;
	}
	
	public char method() {
		
		
		return 'c';
	
}
	
	public static void main(String[] args) {
		
		WArgsWReturn var= new WArgsWReturn();
		var.method(10,5);
		var.method();
		
	}

}
