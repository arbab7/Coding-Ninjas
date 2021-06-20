package javaDataStructures;

import java.util.ArrayList;
import java.util.HashMap;

class HelperClass{
	int index;
	boolean check;
	public HelperClass(int index, boolean check) {
		this.index = index;
		this.check = check;
	}
}

public class LargestConsecutiveSequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		if (arr.length == 0) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(0);
			return output;
		}
		HashMap<Integer, HelperClass> map = new HashMap<Integer, HelperClass>();
		int start = Integer.MAX_VALUE;
		int maxLenght = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], new HelperClass(i, true));
		}
		for (int i : arr) {
			if (map.get(i).check) {
				HelperClass temp = map.get(i);
				temp.check = false;
				map.put(i, temp);
				int count = 1;
				int j = i + 1;
				while (map.containsKey(j)) {
					count++;
					HelperClass temp2 = map.get(j);
					temp2.check = false;
					map.put(j, temp2);
					j++;
				}
				j = i - 1;
				while (map.containsKey(j)) {
					count++;
					HelperClass temp2 = map.get(j);
					temp2.check = false;
					map.put(j, temp2);
					j--;
				}
				if (count > maxLenght) {
					maxLenght = count;
					start = j + 1;
				}
				else if (count == maxLenght) {
					int startIndex = map.get(start).index;
					int currIndex = map.get(j + 1).index;
					if (currIndex < startIndex) {
						start = j + 1;
					}
				}
			}
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < maxLenght; i++) {
			output.add(start + i);
		}
		return output;
	}

}
