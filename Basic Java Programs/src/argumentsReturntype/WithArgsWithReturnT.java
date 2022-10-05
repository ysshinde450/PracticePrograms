package argumentsReturntype;

public class WithArgsWithReturnT { //with args with return type
	int c;
	public int Yogesh(int math, int chem, int phys) {
		System.out.println("Marks of Aakash as "+"Math: "+math+", Chemistry: "+chem+", physics: "+phys);
		c = math+chem+phys;
		return c;
	}
	public int Dinesh(int math, int chem, int phys) {
		System.out.println("Marks of Aakash as "+"Math: "+math+", Chemistry: "+chem+", physics: "+phys);
		c = math+chem+phys;
		return c;
	}
	public int Aakash(int math, int chem, int phys) {
		System.out.println("Marks of Aakash as "+"Math: "+math+", Chemistry: "+chem+", physics: "+phys);
		c = math+chem+phys;
		return c;
	}
	public static void main(String[] args) {
		WithArgsWithReturnT var=new WithArgsWithReturnT ();
		var.Yogesh(50, 40, 30);
		System.out.println("Total: "+var.c);
		var.Dinesh(30, 30, 30);
		System.out.println("Total: "+var.c);
		var.Aakash(40, 40, 30);
		System.out.println("Total: "+var.c);
	}
}
