package argumentsReturntype;

public class WithoutArgsWithReturnT { // Without arg with return type
	public int Yogesh(){
		int math=50,chem=40, phys=30, c;
		System.out.print("Marks for Yogesh"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
		c=math+chem+phys;
		return c;
	}
	public int Dinesh(){
		int math=40,chem=30, phys=30, c;
		System.out.print("Marks for Aakash"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
		c=math+chem+phys;
		return c;
	}
	public int Aakash(){
		int math=40,chem=40, phys=30, c;
		System.out.print("Marks for Dinesh"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
		c=math+chem+phys;
		return c;
	}
	public static void main(String[] args) {
		WithoutArgsWithReturnT var=new WithoutArgsWithReturnT();
		var.Yogesh();
		var.Dinesh();
		var.Aakash();		
	}
}