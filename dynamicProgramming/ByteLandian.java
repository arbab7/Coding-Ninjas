package dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;
public class ByteLandian {
	
	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	public static long bytelandian(long n){
		return bytelandianHelper(n);		
	}

	public static long bytelandianHelper(long n){
		// Write your code here
		if (n < 12) {
			return n;
		}
		if (!map.containsKey(n)) {
			long temp = bytelandianHelper(n / 2) + bytelandianHelper(n / 3) + bytelandianHelper(n / 4);
			map.put(n, temp);
		}
		return map.get(n);
	}




	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		long n = s.nextLong();
		System.out.println(bytelandian(n));
//		System.out.println(Long.MAX_VALUE);
	}
}
