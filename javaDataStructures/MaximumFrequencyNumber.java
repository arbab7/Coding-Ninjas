package javaDataStructures;

import java.util.HashMap;
import java.util.Set;

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				map.put(arr[i], value + 1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int value = 0;
		int key = -1;
		for (Integer i: arr) {
			if (map.get(i) > value) {
				value = map.get(i);
				key = i;
			}
		}
		return key;
	}

}
