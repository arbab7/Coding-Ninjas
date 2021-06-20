package myJavaProject;

import java.util.Scanner;

public class CountWords {
	
	public static int countWords(String str){
		int count=0;
		for (int i = 0; i < str.length();i++) {
			if (str.charAt(i)!=' ') {
				count++;
				while (i<str.length()&&str.charAt(i)!=' ') {
					i++;
				}
			}
		}
		return count;

	}
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(countWords(str));
	}

}
