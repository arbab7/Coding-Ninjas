package javaDataStructures;

class DiameterbinaryTreeReturn{

	int height;
	int diameter;
	
	public DiameterbinaryTreeReturn(int height, int diameter) {
		this.height = height;
		this.diameter = diameter;
	}
}

public class DiameterOfBinaryTree {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		DiameterbinaryTreeReturn output = diameterTreeBetter(root);
		return output.diameter;
	}
	
	public static DiameterbinaryTreeReturn diameterTreeBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new DiameterbinaryTreeReturn(0, 0);
		}
		if (root.left == null && root.right == null) {
			return new DiameterbinaryTreeReturn(1, 0);
		}
		DiameterbinaryTreeReturn leftOutput = diameterTreeBetter(root.left);
		DiameterbinaryTreeReturn rightOutput = diameterTreeBetter(root.right);
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		int diameter = leftOutput.height + rightOutput.height + 2;
		int subDiameter = Math.max(leftOutput.diameter, rightOutput.diameter);
		if ( subDiameter > diameter) {
			diameter = subDiameter;
		}
		return new DiameterbinaryTreeReturn(height, diameter);
	}
	
}
