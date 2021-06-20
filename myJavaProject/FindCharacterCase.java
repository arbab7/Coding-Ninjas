package myJavaProject;

import java.util.Scanner;

public class FindCharacterCase{


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
 		char ch=str.charAt(0);
		int i=ch;
		
		if (65<=i && i<=90){
			System.out.println('1');
		}else if (97<=i&& i<=122) {
			System.out.println('0');
		}else {
			System.out.println("-1");
		}

}}
