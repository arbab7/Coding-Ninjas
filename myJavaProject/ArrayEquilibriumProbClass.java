package myJavaProject;

public class ArrayEquilibriumProbClass {

	public static int arrayEquilibrium(int[] arr){  
		int leftSum = 0, totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int rightSum = totalSum - leftSum - arr[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}
	
}
