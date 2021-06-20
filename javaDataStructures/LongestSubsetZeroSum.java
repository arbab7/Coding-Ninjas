package javaDataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubsetZeroSum {

	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int longestSubarray = 0;
		int sum = 0;
		map.put(sum, -1);
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			if (map.containsKey(sum)) {
				int temp = i - map.get(sum);
				longestSubarray = Math.max(longestSubarray, temp);
			}else {
				map.put(sum, i);
			}
		}
		return longestSubarray;
	}
	
}
