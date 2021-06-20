package javaDataStructures;

class PairAns {
	int min;
	int max;
}

public class MinAndMax {

	public static PairAns minMax(BinaryTreeNode<Integer> root) {

		if (root == null) {
			PairAns output = new PairAns();
			output.max = Integer.MIN_VALUE;
			output.min = Integer.MAX_VALUE;
			return output;
		}
		if (root.left == null && root.right == null) {
			PairAns output = new PairAns();
			output.max = root.data;
			output.min = root.data;
			return output;
		}
		PairAns left = minMax(root.left);
		PairAns right = minMax(root.right);
		int max = Math.max(left.max, right.max);
		int min = Math.min(left.min, right.min);
		if (root.data > max) {
			max = root.data;
		}
		if (root.data < min) {
			min = root.data;
		}
		PairAns output = new PairAns();
		output.max = max;
		output.min = min;
		return output;
		
	}

}
