package javaDataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static int[] stockSpan(int[] price) {
		// Write your code here
		Stack<Integer> stack = new Stack<Integer>();
		int[] output = new int[price.length];
		for (int i = 0; i < price.length; i++) {
			while (stack.size() != 0 && price[stack.peek()] < price[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				output[i] = i + 1;
			}
			else {
				output[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return output;
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		int output[] = stockSpan(input);
		for(int i = 0; i < size; i++) {
			System.out.print(output[i] + " ");
		}
	}
}