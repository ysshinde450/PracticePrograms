package argumentsReturntype;

public class WithoutArgsWithoutReturnT { //Without args without return type
	
	public void Yogesh() {
		int math=50,chem=40, phys=30;
		System.out.print("Marks for Yogesh"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
	}
	public void Dinesh() {
		int math=40,chem=30, phys=20;
		System.out.print("Marks for Yogesh"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
	}
	public void Aakash() {
		int math=40,chem=30, phys=30;
		System.out.print("Marks for Yogesh"+" Maths: "+math+", Chemistry "+chem+", Physics "+phys);
		System.out.println();
	}
	public static void main(String[] args) {
		WithoutArgsWithoutReturnT var=new WithoutArgsWithoutReturnT();
		var.Yogesh();
		var.Dinesh();
		var.Aakash();
	}
}
