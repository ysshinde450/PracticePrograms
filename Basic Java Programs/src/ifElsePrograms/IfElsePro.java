package ifElsePrograms;
public class IfElsePro {
	int math; 	int chem;	int phy;		
	public static void main(String[] args) {
	new IfElsePro(50, 40, 45,"Yogesh");
	new IfElsePro(40, 50, 70,"Dinesh");
	new IfElsePro(50, 40, 20,"Aakash");
	}
	public IfElsePro(int math, int chem, int phy, String s) {
		this.math=math; this.chem=chem; this.phy=phy;
		System.out.println("Marks of the student: "+s+"Maths: "+math+"\nChemistry: "+chem+"\nPhysics: "+phy);
		totalMarks(s);
    }
	public void totalMarks(String s) {
		int total=math+chem+phy;
		System.out.println("Total marks: "+total);
		if((math>=40)&&(chem>=40)&&(phy>=40)&&(total>=120)) {
			System.out.println("******Pass******\n");
		}
		else
			System.out.println("******Fail*******\n");
	}
}
