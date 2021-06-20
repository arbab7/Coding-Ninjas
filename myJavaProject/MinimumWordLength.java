package myJavaProject;

import java.util.Scanner;

public class MinimumWordLength {

	public static String minLengthWord(String input){
		int n=Integer.MAX_VALUE;
		String st="";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)!=' ') {
				String temp="";
				while (i<input.length()&&input.charAt(i)!=' ') {
					temp+=input.charAt(i);
					i++;
				}
				if (temp.length()<n) {
					st=temp;
					n=temp.length();
				}
			}
		}
		return st;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
	}

}
