package tryingConstructor;

public class ConstrProgramForStuMarsks {
		int a=10;
		int b;
		int c;
		int total;
		String s="Seema";
	public ConstrProgramForStuMarsks(int a, int b, int c, String studName) {
		total=a+b+c;
		System.out.println("Total Marsk of "+studName+" = "+total);
		System.out.println("Maths: "+a);
		System.out.println("Chemistry: "+b);
		System.out.println("Physics: "+c); System.out.println("\n");
		
	}
	
	public static void main(String[] args) {		
		new ConstrProgramForStuMarsks(50,80,70,"Yogesh"); //after executing this line garbage collector destroy memory
		new ConstrProgramForStuMarsks(40,70,80,"Dinesh"); //after executing this line garbage collector destroy memory
		new ConstrProgramForStuMarsks(60,90,60,"Aakash"); //after executing this line garbage collector destroy memory
		// here this good example of memory optimization
	}
	
}


