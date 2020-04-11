/**
 * 
 */
package AyaKathem_assing4.Linkedqueue;

import java.util.Iterator;
/**
 * @author Aya Kathem
 *
 */
public class LinkedQueue <T> implements GenericQueue<T>{
	
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	
	/*
	 * Class for the nodes keeping one object each.
	 */
	private class Node {
		 Object data;
		 Node next = null;
		
			Node(Object o) {
			data = o;
		}
	}
	
	/*
	 * Returns current queue size
	 */
	@Override
	public int size() {
		return size;
	}

	/*
	 * Checks if the queue is empty.
	 */
	@Override
	public boolean isEmpty() {
			
		return head == null;
	}
	
	
	// help method to check if the queue is empty
	private void check() {
		if(isEmpty()){
			throw new RuntimeException("The Queue is empty");
		}
	}
	
	/*new element added to the queue
	 * when the new elemet add to the queue,
	 * it sheft the other elemets one step to rigth 
	 */

	@Override
	public void enqueue(T element) {
		if(head == null) {
			head = new Node(element);
			tail = head;
		}
		else {
			tail.next = new Node(element);
			tail = tail.next;
		}
		size += 1;		
	}

	/**
	 * Returns and removes the first element.
	 */
	@Override
	public T dequeue() throws IndexOutOfBoundsException {
		if (isEmpty() == true) { // if empty throw excption 
			throw new IndexOutOfBoundsException();
		}
		Object returnObject = head.data;
		head = head.next;
		size -= 1; // remove the element at the first postion 
		return (T) returnObject; // return the element at the first postion
	}

	/**
	 * Returns the first object without removing it.
	 */
	
	@Override
	public T first() {
		
		
		if (size < 0)  // check if it is empty 
			check() ;
		
		
		return (T) head.data;
	
		
	}

	/**
	 * Return the last object without removing it
	 */
	
	@Override
	public T last() {
		if (size < 0) 
			check() ;
		
		return (T) tail.data;
		
	
	}

	
	public String toString() {
		String queueString = "[ ";
		Node node = head;
		
		while (node.next != null) {
			queueString += node.data + " , ";
			node = node.next;
		}
		
		queueString += node.data + " ]";
		return queueString;
	}
	
	
	/**
	 * Class for the Iterator
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Iterator iterator() {
		Iterator r= new Iterator() {
			
        private Node o = head;   
        public Object next() {
        	Object n = o.data;
        	o = o.next;
        	return n;
        }
        
           public boolean hasNext() {
                return o != null;		
       	    }
            
           
            
        };
        return r;
	}

}
