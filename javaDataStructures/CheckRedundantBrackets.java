package javaDataStructures;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {
	
	public static boolean checkRedundantBrackets(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ')') {
				int count = 0;
				while (stack.peek() != '(') {
					stack.pop();
					count++;
				}
				if (count == 0) {
					return true;
				}
				stack.pop();
			}else stack.push(input.charAt(i));
		}
		return false;
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(checkRedundantBrackets(input));
	}
}
