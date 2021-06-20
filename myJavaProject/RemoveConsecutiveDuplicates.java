package myJavaProject;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String input) {
		String str="";
		str+=input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			int n=str.length();
			if (input.charAt(i)!=str.charAt(n-1)) {
				str+=input.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}
}
