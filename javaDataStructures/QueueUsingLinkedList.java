package javaDataStructures;

public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T element) {
		Node<T> newNode = new Node<>(element);
		if (front == null) {
			front = newNode;
		}else {
			rear.next = newNode;
		}
		rear = newNode;
		size++;
	}
	
	public T front() throws QueueEmptyException{
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException{
		if (size == 0) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		size--;
		if (size == 0) {
			rear = null;
		}
		return temp;
	}
}
