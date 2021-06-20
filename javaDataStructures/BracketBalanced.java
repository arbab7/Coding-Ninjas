package javaDataStructures;

import java.util.Scanner;
import java.util.Stack;


public class BracketBalanced {

	public static boolean checkBalanced(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			}
			else if (c == ']' || c == '}' || c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (top == '[' && c ==']' || top == '{' && c =='}' || top == '(' && c ==')') {
					continue;
				}
				else return false;
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(checkBalanced(input));
	}
}