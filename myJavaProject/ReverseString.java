package myJavaProject;

import java.util.Scanner;

public class ReverseString {

	public static void reverseString(String str) {
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static String retRevString(String str) {
		String St="";
		for (int i = str.length()-1; i >=0; i--) {
			St+=str.charAt(i);
		}
		return St;
	}
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String star=s.nextLine();
	reverseString(star);
//	String a=retRevString(star);
//	System.out.println(a);
	}

}
