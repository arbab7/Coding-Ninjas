package myJavaProject;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void simplify() {
		int min = Math.min(numerator, denominator);
		int hcf = 1;
		for (int i = 2; i <= min; i++) {
			if (numerator % i == 0 && denominator % i ==0) {
				hcf = i;
			}
		}
		numerator = numerator / hcf;
		denominator = denominator / hcf;		
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
	}
	
	public void setDenominator(int num) {
		this.denominator = num;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(Fraction f) {
		this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
	
	public void increment() {
		numerator = numerator + denominator;
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int numerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int denominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}

	
	
}
