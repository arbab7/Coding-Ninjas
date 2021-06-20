package myJavaProject;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
		String str="";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)!=c) {
				str+=input.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(input, c));
	}
}
