package myJavaProject;


import java.util.Scanner;


public class StringPalindrome {
	
	public static boolean checkPalindrome(String str) {
		int n=str.length();
		for (int i = 0; i <(n+1)/2; i++) {
			if (str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(checkPalindrome(str));
	}


}
