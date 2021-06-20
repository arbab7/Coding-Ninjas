package myJavaProject;

import java.util.Scanner;
public class TripletSum {


	public static void findTriplet(int[] arr, int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length;j++){
				for (int k=0;k<arr.length;k++){
					if (arr[i]+arr[j]+arr[k]==x){
						if(arr[i]>=arr[j]){
							if(arr[k]>=arr[i]){
								System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
							}else{
								if(arr[j]>=arr[k]){
									System.out.println(arr[k]+" "+arr[j]+" "+arr[i]);
								}else{
									System.out.println(arr[j]+" "+arr[k]+" "+arr[i]);
								}}
						}


						else{
							if(arr[k]>=arr[j]){
								System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
							}else {
								if(arr[i]>=arr[k]){
									System.out.println(arr [k]+" "+arr[i]+" "+arr[j]);
								}else{
									System.out.println(arr [i]+" "+arr[k]+" "+arr[j]);
								}
							}
						}

					}
				}
			}
		}
	}



	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){

		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		int x = s.nextInt();
		findTriplet(arr, x);

	}
}