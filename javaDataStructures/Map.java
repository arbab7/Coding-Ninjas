package javaDataStructures;

import java.util.ArrayList;

public class Map<K, V> {

	private ArrayList<MapNode<K, V>> bucket;
	private int count;
	private int bucketSize;
	
	public Map() {
		bucket = new ArrayList<MapNode<K,V>>(20);
		bucketSize = 20;
		for (int i = 0; i < bucketSize; i++) {
			bucket.add(null);
		}
	}
	
	private void rehash() {
		ArrayList<MapNode<K, V>> temp = bucket;
		bucket = new ArrayList<MapNode<K,V>>();
		count = 0;
		bucketSize = 2 * bucketSize;
		for (int i = 0; i < bucketSize; i++) {
			bucket.add(null);
		}
		for (int i = 0; i < temp.size(); i++) {
			MapNode<K, V> head = temp.get(i);
			while (head != null) {
				insert(head.key, head.value);
				head = head.next;
			}
		}
	}
	
	private int getBucketIndex(K key) {
		int hashcode = key.hashCode();
		int bucketIndex = hashcode % bucketSize;
		return bucketIndex;
	}
	
	public void insert(K key, V value) {
		int index = getBucketIndex(key);
		MapNode<K, V> head = bucket.get(index);
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = bucket.get(index);
		MapNode<K, V> newHead = new MapNode<K, V>(key, value);
		newHead.next = head;
		bucket.set(index, newHead);
		count++;
		double loadFactor = 1.0 * count / bucketSize;
		if (loadFactor > 0.7) {
			rehash();
		}
	}
	
	public int size() {
		return count;
	}
	
	public V get(K key) {
		int index = getBucketIndex(key);
		MapNode<K, V> head = bucket.get(index);
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public V delete(K key) {
		int index = getBucketIndex(key);
		MapNode<K, V> head = bucket.get(index), prevNode = null;
		while (head != null) {
			if (head.key.equals(key)) {
				if (prevNode == null) {
					bucket.set(index, head.next);
				}else {
					prevNode.next = head.next;
				}
				count--;
				return head.value;
			}
			prevNode = head;
			head = head.next;
		}
		return null;
	}
	
}
