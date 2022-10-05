package tryingNewPrograms;

public class TryingFibonacci {
	public static void main(String[] args) {
		int count=12; int a=0; int b=1; int var;
		System.out.println(a+"\n\n"+b);
		for(int i=1;i<count;++i) {
			var=a+b; //i=0+1=1
			System.out.println("\n"+var);
			a=b; //1=1
			b=var; //1=1
		}
	}
}


//0 1 1 2 3 5 8 13 21 34