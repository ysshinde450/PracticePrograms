package simplePrograms;

public class SecondLargestArrayElement {
	
	public static int method() {
		int[] a= {10,20,30,20,10,40,50};
		int temp=0, b=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
			
		}
		
		return a[a.length-2];
//		System.out.println();
//		
//		for(int i=a.length-2;i>=0;i--) {
//			if(a[i]!=a[a.length-1]) {
//				System.out.print("This is the second largest element: "+a[i]);
//				return;
//			}
//		}
//		System.out.print("There is no second largest element");
	}
	public static void main(String[] args) {
		System.out.println(method());
	}

}
