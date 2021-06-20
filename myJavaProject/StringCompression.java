package myJavaProject;

import java.util.Scanner;

public class StringCompression {
	
	public static String compress(String input) {
		String st="";
		int count=1;
		int i = 0;
		for (; i < input.length(); i++) {
			int n=st.length();
			if (n>0&&input.charAt(i)==st.charAt(n-1)) {
				count++;
			}else {
				if (count!=1) {
					st=st+count;
				}
				count=1;
				st+=input.charAt(i);
			}
		}
		if (count!=1) {
			   st+=count;
		}
		return st;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}
}
