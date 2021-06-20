package myJavaProject;

public class PrimitivesAndNonPrimitives {

	public static void printArray(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void increment(int[] i) {
//		i=new int[10];
		for (int j = 0; j < i.length; j++) {
			i[j]+=1;
		}
	}
	
	public static void main(String[] args) {
//		int i=10;
//		increment(i);
//		System.out.println(i);
//		
		int arr[]= {1,2,3,4,5};
		increment(arr);
		printArray(arr);
		
		
	}

}
