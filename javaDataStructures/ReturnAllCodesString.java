package javaDataStructures;

public class ReturnAllCodesString {

	public static  String[] getCode(String input){
		return helper(input, 0);
	}

	public static String[] helper(String input, int i) {
		if (i >= input.length()) {
			String[] output = {""};
			return output;
		}
		char c1 = (char)(input.charAt(i) + 48);
		String[] smallOutput1 = {};
		if (c1 > 95 && c1 < 123) {
			smallOutput1 = helper(input, i + 1);
		}

		String [] smallOutput2 = {};
		char c2 = '\0';
		if (i <= input.length() - 2) {
			c2 = (char)(((input.charAt(i) - 48) * 10) + (input.charAt(i + 1) - 48) + 96);
			if (c2 > 95 && c2 < 123) {
				smallOutput2 = helper(input, i + 2);
			}
		}

		String[] output = new String[smallOutput1.length + smallOutput2.length];
		int k = 0;
		for (int j = 0; j < smallOutput1.length; j++) {
			output[k++] = c1 + smallOutput1[j];
		}
		for (int j = 0; j < smallOutput2.length; j++) {
			output[k++] = c2 + smallOutput2[j];
		}
		return output;
		
	}
	
}
