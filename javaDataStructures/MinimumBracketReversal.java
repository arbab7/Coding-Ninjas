package javaDataStructures;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input){
//		if (input.length() % 2 != 0) {
//			return -1;
//		}
//		Stack<Character> stack = new Stack<Character>();
//		int count = 0;
//		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//			if (c == '{') {
//				stack.push(c);
//			}else if (c == '}') {
//				if (stack.size() == 0) {
//					count++;
//				}
//				else stack.pop();
//			}
//		}
//		int output = (count + 1) / 2 + (stack.size() + 1) / 2;
//		return output;
		
		if (input.length() % 2 != 0) {
			return -1;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '{') {
				stack.push(c);
			}
			else if (c == '}') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '{') {
						stack.pop();
					}
					else {
						stack.push(c);
					}
				}
				else {
					stack.push(c);
				}
			}
		}
		int count = 0;
		while (!stack.isEmpty()) {
			char c1 = stack.pop();
			char c2 = stack.pop();
			if (c1 == c2) {
				count ++;
			}else {
				count += 2;
			}
		}
		return count;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(countBracketReversals(str));

	}

}
