package javaDataStructures;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<E> {
    
	public Queue<E> queue1;
	public Queue<E> queue2;
	
	public StackUsingQueue() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	public void push(E element) {
		queue1.add(element);
	}
	
	public E top() {
		E temp = null;
		if (queue1.isEmpty()) {
			return temp;
		}
		while (!queue1.isEmpty()) {
			temp = queue1.poll();
			queue2.add(temp);
		}
		while (!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
		return temp;	
	}
	
	public E pop() {
		E temp = null;
		if (queue1.isEmpty()) {
			return temp;
		}
		while (queue1.size() != 1) {
			temp = queue1.poll();
			queue2.add(temp);
		}
		temp = queue1.poll();
		while (!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
		return temp;
	}
	
	public int getSize() {
		return queue1.size();
	}
	
	public Queue<E> getQueue() {
		Queue<E> queue3 = new LinkedList<E>();
		while (!queue1.isEmpty()) {
			E temp = queue1.poll();
			queue2.add(temp);
			queue3.add(temp);
		}
		while (!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
		return queue3;
	}
	
	
    public static void main(String args[]){
        StackUsingQueue<Integer> s = new StackUsingQueue<>();
        Scanner sc = new Scanner(System.in);
        int choice; 
        int input;
            
        while(true){
                
            choice = sc.nextInt();
                
            switch(choice){
                case 1:
                    input = sc.nextInt();
                    s.push(input);
                    break;
                case 2:

                    Integer ele = s.pop();

                    if(ele != null) {
                        System.out.println(ele);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    Integer elem = s.top();
                    if(elem != null) {
                        System.out.println(elem);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 4 :
                    System.out.println(s.getSize());
                    break;
                case 5 : // Test
                    Queue<Integer> q = s.getQueue();
                    while(!q.isEmpty()) {
                        Integer e = q.peek();
                        q.remove();
                        System.out.print(e + " ");
                    }   
                    System.out.println();
                    return;
                default:
                    return;
            }
        }
    }
}