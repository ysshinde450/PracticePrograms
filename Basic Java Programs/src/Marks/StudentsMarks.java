package Marks;

public class StudentsMarks {
	int math;
	int physics;
	int chemistry;
	
	public static void main(String[] args) {
		System.out.println("Below are the students mark list");
		StudentsMarks raju = new StudentsMarks();
		StudentsMarks Avdhut = new StudentsMarks();
		StudentsMarks Joy = new StudentsMarks();
		raju.math=50; raju.physics=60; raju.chemistry=70;
		Avdhut.math=80; Avdhut.physics=90; Avdhut.chemistry=100;
		Joy.math=60; Joy.physics=70; Joy.chemistry=80;
		System.out.println("Raju: "+"math-"+raju.math+" physics-"+raju.physics+" chemistry"+raju.chemistry);
		System.out.println("Avdhut: "+"math-"+Avdhut.math+" physics-"+Avdhut.physics+" chemistry"+Avdhut.chemistry);
		System.out.println("Joy: "+"math-"+Joy.math+" physics-"+Joy.physics+" chemistry"+Joy.chemistry);
	}
	
}

