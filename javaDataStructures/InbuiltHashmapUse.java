package javaDataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class InbuiltHashmapUse {

	public static ArrayList<Integer> removeDuplicates(int[] array) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				continue;
			}
			output.add(array[i]);
			map.put(array[i], true);
		}
		return output;
	}
	
	public static void arrayIntersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				int value = map.get(arr1[i]);
				map.put(arr1[i], value + 1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				int value = map.get(arr2[i]);
				if (value > 0) {
					System.out.println(arr2[i]);
					map.put(arr2[i], value - 1);
				}
			}
		}
	}
	
	public static void main(String[] args) {

//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//		map.put("abc", 1);
//		map.put("def", 3);
//		
//		if (map.containsKey("abc")) {
//			System.out.println("map has abc");
//		}
//		if (map.containsKey("abd")) {
//			System.out.println("map doesn't have abd");
//		}
//		map.containsKey("bcd");
//		
//		int i = map.get("def");
//		System.out.println(i);
//		
//		System.out.println(map.get("abc1"));
//		
//		map.remove("abc1");
//		
//		Set<String> keys = map.keySet();
//		for (String s : keys) {
//			System.out.println(s + " " + map.get(s));
//		}
		
		int[] arr = {5, -2, 0, -5, 0 , 2};
//		System.out.println(removeDuplicates(arr));
//		int[] arr2 = {4, 2, 3, 9, 7, 5, 8, 5};
//		arrayIntersection(arr, arr2);
//		System.out.println(MaximumFrequencyNumber.maxFrequencyNumber(arr));
		PairSumTo0.PairSum(arr, arr.length);
	}

}
