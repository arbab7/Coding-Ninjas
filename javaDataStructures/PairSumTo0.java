package javaDataStructures;

import java.util.HashMap;
import java.util.Set;

public class PairSumTo0 {

	public static void PairSum(int[] input, int size) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print the desired output and don't return anything.
		 * Taking input is handled automatically.
		 */
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : input) {
			if (map.containsKey(-1 * i)) {
				for (int j = 0; j < map.get(-1 * i); j++) {
					System.out.println(Math.min(i, -1 * i) + " " + Math.max(i, -1 * i));
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
