package javaDataStructures;

public class PrintAllCodesString {

	public static void printAllPossibleCodes(String input) {
		String[] output = {};
		helper(input, 0, output);

	}

	public static void helper(String input, int i, String[] output) {
		if (i == input.length()) {
			for (int j = 0; j < output.length; j++) {
				System.out.println(output[j]);
			}
			return;
		}

		char c1 = (char)(input.charAt(i) + 48);
		String[] output1 = new String[output.length];

		if (c1 > 95 && c1 < 123) {
			if (output.length == 0) {
				output1 = new String[1];
				output1[0] = "" + c1;
			}else {
				for (int j = 0; j < output1.length; j++) {
					output1[j] = output[j] + c1;
				}
			}
			helper(input, i + 1, output1);
		}

		String [] output2 = new String[output.length];
		char c2 = '\0';
		if (i <= input.length() - 2) {
			c2 = (char)(((input.charAt(i) - 48) * 10) + (input.charAt(i + 1) - 48) + 96);
			if (c2 > 95 && c2 < 123) {
				if (output2.length == 0) {
					output2 = new String[1];
					output2[0] = "" + c2;
				}else {
					for (int j = 0; j < output2.length; j++) {
						output2[j] = output[j] + c2;
					}
				}
				helper(input, i + 2, output2);
			}
		}
	}

}
