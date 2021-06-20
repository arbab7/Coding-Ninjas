package myJavaProject;

import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String input) {
		char ch=' ';
		int count=0;
		for (int i = 0; i <input.length(); i++) {
			int temp=0;
			for (int j = i; j < input.length(); j++) {
				if (input.charAt(j)==input.charAt(i)) {
					temp++;
				}
			}
			if (temp>count) {
				count=temp;
				ch=input.charAt(i);
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(highestOccuringCharacter(input));
	}
}
