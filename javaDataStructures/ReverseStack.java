package javaDataStructures;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if (s1.size() == 0 || s1.size() == 1 ) {
			return;
		}
		int temp = s1.pop();
		reverseStack(s1, s2);
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(temp);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int size = s.nextInt();
		Stack<Integer> input = new Stack<Integer>();
		for(int i = 0; i < size; i++) {
			input.push(s.nextInt());
		}
		Stack<Integer> extra = new Stack<Integer>();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			System.out.print(input.pop() + " ");
		}
	}
}

