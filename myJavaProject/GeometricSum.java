package myJavaProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {
	
	public static int power(int x, int k) {
		if (k == 0) {
			return 1;
		}
		return x * power(x, k - 1);
	}
	
	public static double findGeometricSum(int k) {
		if (k == 0) {
			return 1;
		}
		int factor = power(2, k);
		double output = 1.0 / factor + findGeometricSum(k - 1);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
//		DecimalFormat dec = new DecimalFormat("#0.00000");
//		System.out.println(dec.format(ans));
		System.out.println(ans);
	}
}
