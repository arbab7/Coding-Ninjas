package myJavaProject;

import java.util.Scanner;

public class PrintAllCharOfString {

	public static void printChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		printChar(word);
	}  

}
