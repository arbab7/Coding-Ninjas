package myJavaProject;

public class ComplexNumbers {
	//Coding Ninjas Complex Numbers Problem solution
	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void plus(ComplexNumbers c) {
		this.real +=c.real;
		this.imaginary += c.imaginary;
	}
		
	public void multiply(ComplexNumbers c) {
		int tempReal = this.real * c.real - this.imaginary * c.imaginary;
		int tempImaginary = this.real * c.imaginary + this.imaginary * c.real;
		this.real = tempReal;
		this.imaginary = tempImaginary;
	}

	public void print() {
		System.out.println(real + " + i"+ imaginary);
	}

}
