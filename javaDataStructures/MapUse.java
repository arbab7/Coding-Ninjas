package javaDataStructures;

public class MapUse {

	public static void main(String[] args) {
		Map<String, Integer> map = new Map<String, Integer>();
		map.insert("abc", 5);
		map.insert("def", 10);
		map.insert("abc", 4);
		System.out.println(map.get("abc"));
		System.out.println(map.size());
	}
	
}
