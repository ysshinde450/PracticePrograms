package tryingConstructor;

public class StudMarks {
	int chem;
	int phy;
	int math;
	public void conditionOfMarks() {
		int total=chem+phy+math;
		System.out.println("\nTotal marks = "+total);
		if(chem>=100&&math>=100&&phy>=100&&total>=300)
		    System.out.println("***Pass!!!***\n");
		else
			System.out.println("****Fail*****\n");
	}
	StudMarks(int chem, int phy, int math, String s){
		this.chem=chem;
		this.math=math;
		this.phy=phy;
		System.out.println("Marks of "+s);
		System.out.println("Chemistry: "+chem);
		System.out.println("Physics: "+phy);
		System.out.print("Maths: "+math);
		conditionOfMarks();
	}
	public static void main(String[] args) {
		new StudMarks(100,80,130,"Dinesh");
		new StudMarks(120,110,135, "Yogesh");
		new StudMarks(100,100,100, "Aakash");
	}
}
