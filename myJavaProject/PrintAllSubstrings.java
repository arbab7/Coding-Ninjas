package myJavaProject;

import java.util.Scanner;

public class PrintAllSubstrings {
	
	public static void printSubstrings(String str) {
		for (int start = 0; start < str.length(); start++) {
			for (int end = start; end < str.length(); end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
//		
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < i+1; j++) {
//				String st=str.substring(j, str.length()-i+j);
//				System.out.println(st);
//			}
//		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printSubstrings(str);
	}


}
