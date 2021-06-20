package javaDataStructures;

public class Test2 {
	
	public static void deleteAlternateNodes(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
			if (temp.next != null) {
				temp.next = temp.next.next;
			}else {
				return;
			}
			temp = temp.next;
		}
    }
	
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp2 = null;
		while (temp != null) {
			if (temp.data != 9) {
				temp2 = temp;
			}
			temp = temp.next;
		}
		if (temp2 == null) {
			temp2 = new LinkedListNode(1);
			temp2.next = head;
			head = temp2;
		}else {
			temp2.data++;
		}
		temp = temp2.next;
		while (temp != null) {
			temp.data = 0;
			temp = temp.next;
		}
		return head;
	}
	
}

class Dequeue {
    private int[] data;
    private int size;
    private int front;
    private int rear;
    
    public Dequeue() {
		data = new int[10];
		size = 0;
		front = -1;
		rear = -1;
	}
    
    public void insertFront(int element) {
		if (size == data.length) {
			System.out.println(-1);
			return;
		}
    	if (front == -1) {
			front = 0;
			rear = 0;
		}
    	else if (front == 0) {
			front = data.length - 1;
		}
    	else {
			front--;
		}
    	data[front] = element;
    	size++;
	}
    
    public void insertRear(int element) {
		if (size == data.length) {
			System.out.println(-1);
			return;
		}
		if (rear == -1) {
			front = 0;
			rear = 0;
		}else if (rear == data.length - 1) {
			rear = 0;
		}
		else {
			rear++;
		}
		data[rear] = element;
		size++;
	}
    
    public void deleteFront() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		front++;
		front = front % data.length;
		size--;
		if (size == 0) {
			front = -1;
			rear = -1;
		}
	}
    
    public void deleteRear() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		rear--;
		size--;
		if (size == 0) {
			front = -1;
			rear = -1;
		}else if (rear == -1) {
			rear = data.length - 1;
		}
	}
    
    public int getFront() {
		if (size == 0) {
			return -1;
		}
		return data[front];
	}
    
    public int getRear() {
		if (size == 0) {
			return -1;
		}
		return data[rear];
	}
    
}
