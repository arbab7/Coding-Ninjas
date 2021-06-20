package myJavaProject;

public class RotateArrayTC {

	public static void rotate(int[] arr, int d) {
//		for (int i = 0; i < arr.length; i++) {
//			if (i - d < 0) {
//				int temp = arr[arr.length - d + i];
//				arr[arr.length - d + i] = arr[i];
//			}else {
//				arr[i - d] = [i];
//			}
//		}
	
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		int i = 0, j = 0;
		while (i < arr.length - d) {
			arr[i] = arr[i + d];
			i++;
		}
		while (i < arr.length) {
			arr[i] = temp[j];
			i++;
			j++;
		}
		
	}
	
}
