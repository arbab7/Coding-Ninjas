package myJavaProject;

import java.util.Scanner;

public class DoesSContainT {

	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		if (b.length() == 0) {
			return true;
		}
		if (a.length() == 0) {
			return false;
		}
		String smallStringA = a.substring(1);
		if (a.charAt(0) == b.charAt(0)) {
			String smallStringB = b.substring(1);
			return checkSequence(smallStringA, smallStringB);
		}
		else {
			return checkSequence(smallStringA, b);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(checkSequence(large, small));
	}
	
}
