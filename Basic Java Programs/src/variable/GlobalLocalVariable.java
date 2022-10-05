package variable;

public class GlobalLocalVariable {
	
	public void working() {
		System.out.println("Now working method is executed");
	}
	
	public static void main(String[] args) {
		GlobalLocalVariable abc = new GlobalLocalVariable();
		System.out.println("this is the last line");
		abc.working();
    }
    
}