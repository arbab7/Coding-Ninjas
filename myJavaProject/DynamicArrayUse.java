package myJavaProject;

public class DynamicArrayUse {

	public static void main(String[] args) {

		DynamicArray d = new DynamicArray();
		for (int i = 0; i < 100; i++) {
			d.add(2*i);
		}
		d.print();
		System.out.println(d.size());
		DynamicArray c;
	}

}
