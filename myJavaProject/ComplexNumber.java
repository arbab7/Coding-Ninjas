package myJavaProject;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void print() {
		System.out.println(real + " + i"+ imaginary);
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public void add(ComplexNumber complexNum) {
		this.real +=complexNum.real;
		this.imaginary += complexNum.imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int real = c1.real + c2.real;
		int imaginary = c1.imaginary + c2.imaginary;
		ComplexNumber c3 = new ComplexNumber(real, imaginary);
		return c3;
	}
	
	public void subtract(ComplexNumber c) {
		this.real -= c.real;
		this.imaginary -= c.imaginary;
	}
	
	public void multiply(ComplexNumber c) {
		int tempReal = this.real * c.real - this.imaginary * c.imaginary;
		int tempImaginary = this.real * c.imaginary + this.imaginary * c.real;
		this.real = tempReal;
		this.imaginary = tempImaginary;
	}
	
}
