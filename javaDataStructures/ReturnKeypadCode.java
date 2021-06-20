package javaDataStructures;

import java.util.Scanner;

public class ReturnKeypadCode {

	public static String[] keypad(int n){
		
		String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		return helper(n, keypad);

	}
	
	private static String[] helper(int n, String[] keypad) {
		if (n == 0 || n == 1) {
			String[] output = {""};
			return output;
		}
		String[] smallArray = helper(n / 10, keypad);
		String s = keypad[n % 10];
		String[] output = new String[smallArray.length * s.length()];
		int k = 0;
		for (int i = 0; i < smallArray.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				output[k++] = smallArray[i] + s.charAt(j);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int m = s.nextInt();
		String[] output = keypad(m);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
}
