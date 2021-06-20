package myJavaProject;

import java.util.Scanner;

public class ReverseEachWord {

	public static String reverseWordWise(String input) {
		int n=input.length();
		String output="";
		for (int i = 0; i < n; i++) {
			if (input.charAt(i)!=' ') {
				String temp="";
				while (i<n&&input.charAt(i)!=' ') {
					temp=input.charAt(i)+temp;
					i++;
				}
				if (i<n&&input.charAt(i)==' ') {
					temp+=' ';
				}
				output+=temp;
			}
			else {
				output+=' ';
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(reverseWordWise(input));
	}

}
