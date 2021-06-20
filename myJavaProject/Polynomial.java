package myJavaProject;

public class Polynomial {

	private int[] data;
	private int nextIndex;
	
	public Polynomial() {
		data = new int[5];
		nextIndex = 0;
	}
	
	public void doubleCapacity() {
		int[] temp = data;
		data = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}		
	}
	
	public void append(int num) {
		if (nextIndex == data.length) {
			doubleCapacity();
		}
		data[nextIndex] = num;
		nextIndex++;
	}
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added in the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		while (nextIndex <= degree) {
			append(0);
		}
		data[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for (int i = 0; i < nextIndex; i++) {
			if (data[i] != 0) {
				System.out.print(data[i] + "x" + i + " ");
			}
		}
		System.out.println();
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		while (nextIndex < p.nextIndex ) {
			append(0);
		}
		Polynomial sum = new Polynomial();
		sum.data = data;
		sum.nextIndex = nextIndex;
		for (int i = 0; i < p.nextIndex; i++) {
			int temp = data[i] + p.data[i];
			sum.setCoefficient(i, temp);;
		}
		return sum;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		while (nextIndex < p.nextIndex ) {
			append(0);
		}
		Polynomial difference = new Polynomial();
		difference.data = data;
		difference.nextIndex = nextIndex;
		for (int i = 0; i < p.nextIndex; i++) {
			int temp = data[i] - p.data[i];
			difference.setCoefficient(i, temp);;
		}
		return difference;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial product = new Polynomial();
		for (int i = 0; i < nextIndex; i++) {
			if (data[i] != 0) {
				for (int j = 0; j < p.nextIndex; j++) {
					if (p.data[j] != 0) {
						int degree = i + j;
						int coefficient = data[i] * p.data[j];
						while (product.nextIndex <= degree) {
							product.append(0);
						}
						product.data[degree] += coefficient;
					}
				}
			}
		}
		return product;
	}

}
