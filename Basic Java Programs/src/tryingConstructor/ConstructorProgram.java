package tryingConstructor;

public class ConstructorProgram {
	
	ConstructorProgram(){			
	this(5);
	System.out.println("Constructor 3 is executed.");
	}	
	
	public ConstructorProgram(int a){			
		this("hi");
		System.out.println("Constructor 2 is executed.");
	}	
	
	public ConstructorProgram(String s){		
		System.out.println("Constructor 1 is executed.");
	}
	
	public static void main(String[] args) {		
		new ConstructorProgram();	
		
	}
	
}