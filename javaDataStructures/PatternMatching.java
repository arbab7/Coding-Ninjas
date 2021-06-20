package javaDataStructures;

import java.util.ArrayList;

public class PatternMatching {

	private TrieNode root;
	
	public PatternMatching() {
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
		for (int i = 0; i < word.length(); i++) {
			add(root, word.substring(i));
		}
	}
	
	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}
	
	public boolean patternMatching(ArrayList<String> input, String pattern) {
		for (String s : input) {
			add(s);
		}
		return search(pattern);
		
	}
	
}
