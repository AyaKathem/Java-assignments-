package AyaKathem_assing3.Exercises3_7;

import java.util.Iterator;

public class HashWordSet implements WordSet{
	
		
	private int size=0;
	private Node[] nodeB =new Node[1];	
	
	private class Node {
		//inner class
		public Word data;
		public Node next;
		
		public Node(Word word) { //constructor
			data = word;
		}

	}
	
	
	
	@Override
	public void add(Word w) {
		int b = getIndex(w);  //call mathod that return an index position in the bucket array
		Node node = new Node(w);
		
		if (contains(w)) { // chech if the word is already exist 
			return;
		}
				// add new node 
		node.next = nodeB[b];
		nodeB[b] = node;
		
		size += 1;
		
		if (size == nodeB.length) {		// Rehash if needed
			rehash();
		}
	}
	
	/**
	 *  copied from lecture notes
	 */
	private void rehash() { //save all elements in teporary array 
		Node[] temp = nodeB;
		nodeB = new Node[2 * temp.length];//then dubble the size of buckets
		size = 0;
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == null)
				continue;
		while (temp[i] != null) {
				add(temp[i].data);
				temp[i] = temp[i].next;
				
			}
		}
	
	}

	private int getIndex(Word word) {
		
		int hash = word.hashCode();
		if (hash < 0) {
			hash -= hash;
		}
				
		return hash = hash % nodeB.length;
	}

	
	@Override
	public boolean contains(Word word) {
		
		int b = getIndex(word); 	//find correct bucket
		Node node = nodeB[b];	//First node in list
		
		// go throw the list if there is a match.
		
		
		while (node != null) {
			if (node.data.equals(word)) {
				return true;	//if something found			
			}
			node = node.next;				
		}
		return false; //node not found
	}

	@Override
	public int size() {
		return size;
	}
	
	
	@Override
	public Iterator<Word> iterator() {
		return new HashWordSetIterator();
	}
	
	private class HashWordSetIterator implements Iterator<Word> {
		
		private int in;
		private Node node;
		
		// Iterator
		public HashWordSetIterator() {
			node = null;
			in = 0;
		}

		@Override
		public boolean hasNext() {
			if (node != null && node.next != null) {
				return true; // if node and the next node is not null return null
			}
			// if one of then is null run while loop though the array
			int i =in +1;
				while (i< nodeB.length){
					i++;
				if (nodeB[i] != null) {
					return true;
				}
			}
			
			return false; // if the node == null return false
		}

		@Override
		public Word next() {
			if (node != null && node.next != null) { // if node and next is not null increment the node
				node = node.next;
			} 
			if (node == null || node.next == null) {
				in =0;
				while (in < nodeB.length ){
					    
					if (nodeB[in] == null ){
					in += 1; //increase 
					}
				
					if (in < nodeB.length) {	
					node = nodeB[in];					
				}while(in == 0 ){
					return null;		 // no more index  
				}
			}
			}
			
			else {
				node = node.next;
			}
			// Return data
			return node.data;
		}

	}

	

}
