package javaDataStructures;

import java.util.Scanner;

public class PrintKeypadCombinationsCode {

	public static void printKeypad(int input){
		String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		String[] output = {""};
		helper(input, keypad, output);
	}
	
	public static void helper(int input, String[] keypad, String[] output) {
		if (input == 0 || input == 1) {
			for (int i = 0; i < output.length; i++) {
				System.out.println(output[i]);
			}
			return;
		}
		String m = keypad[input % 10];
		String[] ans = new String[output.length * m.length()];
		int k = 0;
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < m.length(); j++) {
				ans[k++] = m.charAt(j) + output[i];
			}
		}
		helper(input / 10, keypad, ans);
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int m = s.nextInt();
		printKeypad(m);
	}
}
