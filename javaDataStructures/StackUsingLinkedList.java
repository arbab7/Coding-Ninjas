package javaDataStructures;

public class StackUsingLinkedList<T> {

	private Node<T> head;
	private int size;
	
	public StackUsingLinkedList() {
		head = null;
		size = 0;
	}
	
	public void push(T element) {
		Node<T> newHead= new Node<T>(element);
		newHead.next = head;
		head = newHead;
		size++;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() throws StackEmptyException{
		if (size == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop() throws StackEmptyException{
		if (size == 0) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	
}
