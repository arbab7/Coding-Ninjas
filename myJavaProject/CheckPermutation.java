package myJavaProject;

import java.util.Scanner;

public class CheckPermutation {

	public static boolean isPermutation(String input1, String input2) {
	    if (input1.length()==input2.length()) {
			StringBuffer st=new StringBuffer(input2);
	    	for (int i = 0; i < input1.length(); i++) {
				for (int j = 0; j < st.length(); j++) {
					if (input1.charAt(i)==st.charAt(j)) {
						st.deleteCharAt(j);
					}
				}
			}
	    	if (st.length()==0) {
				return true;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(isPermutation(input1, input2));
	}
}
