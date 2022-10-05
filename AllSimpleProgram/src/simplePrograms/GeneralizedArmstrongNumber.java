package simplePrograms;

public class GeneralizedArmstrongNumber {
	
	static double res=0;
	static double rem=0;
	static int a=371;
	static int b=a;
	public static void main(String[]args){
		double changedValue=armstrongLogic(a);
		if(changedValue==b)
		System.out.println("Armstrong Number");
		else
		System.out.println("Not a armstrong number");
	}

	public static double armstrongLogic(int a){
		int countOfnumber=countOfnumber(a);
		while(a>0){
		rem=a%10;
		double countPower=Math.pow(rem, countOfnumber);
		a/=10;
		res=countPower+res;
		}
		return res;
	}

	public static int countOfnumber(int a){
		int i;
		for(i=0;i<a;i++){
			a=a/10;	
		}
		return i;
	}

}
