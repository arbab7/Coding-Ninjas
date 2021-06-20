package myJavaProject;

public class ComplexNumberUse {

	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber(2, 5);
		ComplexNumber c2 = new ComplexNumber(4, -3);
		c1.print();
		c2.print();
		c1.multiply(c2);
		c1.print();
		
	}

}
