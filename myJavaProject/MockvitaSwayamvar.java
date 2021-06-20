package myJavaProject;

import java.util.Scanner;

public class MockvitaSwayamvar {
	public static int leftPairs(String bride, String groom) {
		while (bride.length() > 0) {
			int i = 0;
			while(i < groom.length()) {
				if (bride.charAt(0) == groom.charAt(0)) {
					bride = bride.substring(1);
					groom = groom.substring(1);
					break;
				}
				groom = groom.substring(1) + groom.charAt(0);
				i++;
				if (i == groom.length()) {
					return bride.length();
				}

			}
					}
		return bride.length();
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String bride = s.next();
		String groom = s.next();
		if (bride.length() == n && groom.length()== n) {
			int result = leftPairs(bride, groom);
			System.out.println(result);
		}
		else {
			System.out.println(0);
		}
	}
}
