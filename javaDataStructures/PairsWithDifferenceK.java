package javaDataStructures;

import java.util.HashMap;

public class PairsWithDifferenceK {

	public static void findPairsDifferenceK(int[] input, int k){

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : input) {
			if (map.containsKey(i - k)) {
				int j = i - k;
				for (int l = 0; l < map.get(j); l++) {
					System.out.println(Math.min(i, j) + " " + Math.max(i, j));
				}
			}
			if (k != 0 && map.containsKey(i + k)) {
				int j = i + k;
				for (int l = 0; l < map.get(j); l++) {
					System.out.println(Math.min(i, j) + " " + Math.max(i, j));
				}
			}
			if (map.containsKey(i)) {
				int value = map.get(i);
				map.put(i, value + 1);
			}else {
				map.put(i, 1);
			}
		}
	}
}
