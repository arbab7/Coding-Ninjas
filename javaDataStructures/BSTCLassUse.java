package javaDataStructures;

public class BSTCLassUse {

	public static void main(String[] args) {
		BSTClass t = new BSTClass();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(10);
		t.insert(12);
		t.insert(5);
		t.print();
		t.delete(1);
		t.print();
	}
	
}
