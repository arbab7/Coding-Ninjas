package javaDataStructures;

import java.util.ArrayList;

public class AutoComplete {
	private TrieNode root;

	public AutoComplete() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}


	public void autoComplete(ArrayList<String> input, String word) {
		for (String s : input) {
			add(s);
		}
	
		TrieNode node = getNode(root, word);
		if (node == root) {
			return;
		}
		printAutoComplete(node, word);
	}
	
	private static TrieNode getNode(TrieNode root, String word) {
		if(word.length() == 0){
            return root;
        }
        int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			return root;
		}
		return getNode(child, word.substring(1));
	}
	
	private static void printAutoComplete(TrieNode root, String output) {
		if (root.isTerminating) {
			System.out.println(output);
		}
		if (root.childCount == 0) {
			return;
		}
		for (int i = 0; i < 26; i++) {
			TrieNode child = root.children[i];
			if (child != null) {
				printAutoComplete(child, output + child.data);
			}
		}
	}
}