package javaDataStructures;

import java.util.HashMap;

public class PrintIntersection {

	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr1) {
			if (map.containsKey(i)) {
				int value = map.get(i);
				map.put(i, value + 1);
			}else {
				map.put(i, 1);
			}
		}
		for (int i : arr2) {
			if (map.containsKey(i)) {
				int value = map.get(i);
				if (value > 0) {
					System.out.println(i);
					map.put(i, value - 1);
				}
			}
		}
	}
	
}
