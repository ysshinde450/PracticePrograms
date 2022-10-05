package oopsPolymorphism;

public class Parent {

	public static void m1() {
		System.out.println("m1 parent");
	}

	public static void m1(int a) {
		System.out.println("m1 parent arguments");
	}

	public String m1(boolean b) {
		return "Yogesh";
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.m1(55);
	}
}
/* methods having different forms with a same name is called as polymorphism.
1) overloading-In same class all methods  name are same but different arguments. it can be allowed in different class, requires inheritance.
2) overriding-Override can not possible in same class, allowed in different class.

Overloading-name of methods is same & arguments are different, in same class or in inherited class. (arguments-signature values of that method)
same method name but having different signature value.
Ex-can be different order of arguments or different arguments.

Can we overload main method. yes. cause we can create user defined not static main method.  we can call that user defined main method by obj
creation.

does constructor always follows overloading concepts or not. overloading of constructors if different class name so not possible through out all 
package.

Depending on reference variable of any class decides which methods to be called. Reference based execution for overloading.
*/