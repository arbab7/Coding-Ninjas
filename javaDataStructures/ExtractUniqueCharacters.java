package javaDataStructures;

import java.util.HashMap;

public class ExtractUniqueCharacters {

	public static String uniqueChar(String str) {
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				continue;
			}
			output += c; 
			map.put(c, true);
		}
		return output;
	}
	
}
