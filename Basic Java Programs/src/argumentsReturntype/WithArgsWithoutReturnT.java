package argumentsReturntype;

public class WithArgsWithoutReturnT { // With arguments without return type
	
		public void Yogesh(int math, int chem, int phys) {
			System.out.println("Marks for Yogesh as\nMaths"+math+ "\nChemistry: "+chem+"\nPhysics "+phys+"\n");	
		}
		public void Dinesh(int math, int chem, int phys) {
			System.out.println("Marks for Dinesh as \nMaths: "+math+ "\nChemistry: "+chem+"\nPhysics "+phys+"\n");		
		}
		public void Aakash(int math, int chem, int phys) {
			System.out.println("Marks for Akash as \nMaths: "+math+ "\nChemistry: "+chem+"\nPhysics "+phys+"\n");		
		}
		public static void main(String[] args) {
			WithArgsWithoutReturnT var = new WithArgsWithoutReturnT();
			var.Yogesh(50, 40, 30);
			var.Dinesh(30, 30, 30);
			var.Aakash(40, 40, 30);
		}  
}