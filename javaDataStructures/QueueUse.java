package javaDataStructures;

/*
Queue in collections is an interface.
Can create reference of interfaces but can't instantiate.
Can instantiate using the class which has defined the methods of that interface, Linked list in this case.
*/


public class QueueUse {
	public static void main(String[] args) throws QueueEmptyException {

//		QueueUsingArray queue = new QueueUsingArray();
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		int[] arr = {10, 20, 30, 50, 70};
		for (int i : arr) {
			queue.enqueue(i);
		}
		System.out.println(queue.size());
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.size());
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(6);
		System.out.println(queue.size());
		while (queue.size() != 0) {
			System.out.println(queue.dequeue());
		}
		
	}
}
