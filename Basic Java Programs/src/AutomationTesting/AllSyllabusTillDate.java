package AutomationTesting;

public class AllSyllabusTillDate {
	//for printing any kind of data
		public static void main1(String[] args) {
			System.out.println("Mock Group Revision");// program prints the mock group revision
		}
		
	//for understanding the Architecture of program and creation of method
		public static void on() {
			System.out.println("4");// method 1
		}
		
		public static void first() {
			System.out.println("2");// method 2
			
		}
		
		public static void my() {
			System.out.println("1");// method 3
		}
		public static void program() {
			System.out.println("3");// method 4
		}
		
		public static void methods() {
			System.out.println("5");// method 5
		}
		public static void main2(String[] args) {
			
			my();
			first();
			program();
			on();
			methods();// this will print the my first program on methods
		}


	// for understanding the data types in java

	public class AllSyllabusTillDateDataTypes {

		
		byte a = -127; //byte data type
		byte a1 = 127;
		
		short b = -32768;// short data type
		short b1 = 32767;
		
		int j = -2147483648;//integer data type
		int j1 = 2147483647;
		
		long p = -92233753678754567l;//long data type
		long p1 = -92233753678754567l;
		
		float d = -7554482.88f;//float data type which will gives the output in the floating point
		float d1 = 55275554582.88f;
		
		
		char jj = 'j';//char data type which will give the result in character
		char dd = 'p';
		char cc = 'm';
		char ee = '$';
		char vv = '2';
		char z = '@';
		
	}

	//for understanding the static non static calling inside main methods

	public static void mock() { //this is the static method declared with static key word
		System.out.println("daily mock=static method");
		
	}
	public void group() {  // this is non static methods
		System.out.println("weekly mock=non static method");
		
	}

	public static void main4(String[] args) {
		mock();// by calling the mock() we are calling the non static method
		
		
		AllSyllabusTillDate obj = new AllSyllabusTillDate();
		obj.group();// here we are calling the non static method for calling the non static method we have to create the objects
		
		
	}
	// for understanding the calling static method inside another static methods

	public static void automation() { // static method 1
		System.out.println("automation required programming");
	}

	public static void manual() { // static method 2
		automation();// here we are calling the 1st static methods by giving the name of class of that static method
		System.out.println("manual done manually");
	}

	public static void main5(String[] args) {
		
		manual();// in the main method we are calling the 2nd static methods but 2nd static methods consist of class name of the 
		         //continue:- 1st method so the result will show as automation required programming then show manual done manually
	}

	// for understanding the calling non static method inside another non static methods

	public void may() { //non static method
		june();
		System.out.println("may is 31days month");
	}

	public void june() { // non static method 2
		
		System.out.println("june is 30days month");
	}
	public static void main6(String[] args){ // main method
		
		AllSyllabusTillDate obj = new AllSyllabusTillDate();// it is the non static method so we have to create the new object 
		
		obj.may();//output will be may is 31days month and in next line june is 30 days month
	}

	// for understanding the calling static method inside another non static methods

	public void black() { //non static method
		pink();
	}

	public static void pink() { // static methods
	     System.out.println("pink color");
	}
	public static void main7(String[] args){ //main method
		
		AllSyllabusTillDate obj = new AllSyllabusTillDate();// creating object for non static methods
		
		obj.black();// here we are calling the non static methods which consist of the data of static method will print first
	}

	// for understanding the calling non static method inside static methods

	public void apple() { //non static method 
		System.out.println("apple");
	}

	public static void mango() { //static method
	    AllSyllabusTillDate obj = new AllSyllabusTillDate();
		
		obj.apple();
	}
	public static void main8(String[] args){
		
		mango();
	}

	// for understanding the static variable

	static int j = 01;//static variable

	public static void main9(String[] args){
		
		System.out.print(j);
	}

	//for understanding the non static variable

	 int s = 10;// non static variable

	public static void main10(String[] args){
		AllSyllabusTillDate obj = new AllSyllabusTillDate();
		System.out.print(obj.s);
	}

	// for understanding the default value of variable

	static byte a;
	short b;
	static int c;
	long d;
	static float e;
	double f;
	static boolean g;
	char h;

	public static void main11(String[] args){
		System.out.println(a);
		AllSyllabusTillDate obj = new AllSyllabusTillDate();
		System.out.println(obj.b);
		System.out.println(c);
		System.out.println(obj.d);
		System.out.println(e);
		System.out.println(obj.f);
		System.out.println(g);
		System.out.println(obj.h);
	}

	// for understanding the changing value of non static variable from object  to object

	int z = 14;

	public void check() {
		System.out.println(z);
	}

	public static void main(String[] args) {
		AllSyllabusTillDate obj = new AllSyllabusTillDate();
		obj.check();
		obj.z=01;
		System.out.println(obj.z);//01
		AllSyllabusTillDate obj2 = new AllSyllabusTillDate();
		obj2.z=101;
		System.out.println(obj2.z);//101
		AllSyllabusTillDate obj3 = new AllSyllabusTillDate();
	    obj3.z=23;
	    System.out.println(obj3.z);
	    }

}
