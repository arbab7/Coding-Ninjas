package javaDataStructures;


import java.util.ArrayList;


public class PalindromePair {

	private TrieNode root;
	public int count;

	public PalindromePair() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}


	public boolean isPalindromePair(ArrayList<String> words) {
		for (String s : words) {
			for (int i = 0; i < s.length(); i++) {
				add(s.substring(i));
			}
		}
		
		for (String s : words) {
			String smallWord = "";
			for (int i = 0; i < s.length(); i++) {
				smallWord = s.charAt(i) + smallWord;
				if (smallWord.equals(s.substring(i)) || smallWord.equals(s.substring(i + 1))) {
					return true;
				}
			}
			if (palindromeSearch(root, smallWord)) {
				return true;
			}
		}
		return false;
	}

	private boolean palindromeSearch(TrieNode root, String word) {
		if (root == null) {
			return false;
		}
		if (word.length() == 0) {
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		return palindromeSearch(child, word.substring(1));
	}
	
} 