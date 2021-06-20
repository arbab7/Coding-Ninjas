package myJavaProject;

public class PolynomialD {

	DynamicArray coefficients = new DynamicArray();
	
	public void setCoefficient(int degree, int coefficient) {
		while (coefficients.size() <= degree) {
			coefficients.add(0);
		}
		coefficients.set(degree, coefficient);
	}
	
	public int getCoefficient(int degree) {
		if (coefficients.size() <= degree) {
			return 0;
		}
		return coefficients.get(degree);
	}
	
	public void print() {
		for (int i = 0; i < coefficients.size(); i++) {
			int temp = coefficients.get(i);
			if (temp != 0) {
				System.out.print(temp + "x" + i + " ");
			}
		}
		System.out.println();
	}
	
	public void add(PolynomialD p) {
		while (coefficients.size() < p.coefficients.size()) {
			coefficients.add(0);
		}
		for (int i = 0; i < coefficients.size(); i++) {
			int temp = coefficients.get(i) + p.getCoefficient(i);
			setCoefficient(i, temp);
		}
	}
	
}
