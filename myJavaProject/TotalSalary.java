package myJavaProject;

import java.util.Scanner;
import java.math.*;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int basic= s.nextInt();
		String str= s.next();
		char grade= str.charAt(0);
//		double hra   = 0.20 * basic, da    = 0.5 * basic, pf= 0.11 * basic, allow, totalSalary;
//		if (grade=='A') {
//			allow= 1700.0;
//			totalSalary = basic + hra + da + allow -pf;
//			int r= (int)Math.round(totalSalary);
//			System.out.println(r);
//		}else if (grade=='B') {
//			allow=1500;
//			totalSalary = basic + hra + da + allow -pf;
//			int r= (int)Math.round(totalSalary);
//			System.out.println(r);
//		}else{
//			allow=1300;
//			totalSalary = basic + hra + da + allow -pf;
//			int r= (int)Math.round(totalSalary);
//			System.out.println(r);
//		}		
		
		double hra = 0.2 * basic;
		double da = 0.5 * basic;
		int allow;
		if(grade == 'A') {
			allow = 1700;
		}else if(grade == 'B') {
			allow = 1500;
		}else {
			allow = 1300;
		}
		int pf = (int) (0.11 * basic);
		int totalSalary = (int) (basic + hra + da + allow - pf);
		System.out.println(totalSalary);

	}

}
