package myJavaProject;

import java.util.Scanner;

public class PrintPermutationsOfString {
	
	public static void permutations(String input){
		// Write your code here
		permutationsHelper(input, new String(""));
	}
	
	public static void permutationsHelper(String input, String output) {
		
		if (input.equals("")) {
			System.out.println(output);
			return;
		}
		for (int i = 0; i <= output.length(); i++) {
			String newOutput = output.substring(i) + input.charAt(0) + output.substring(0, i);
			permutationsHelper(input.substring(1), newOutput);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		permutations(input);
	}
}
