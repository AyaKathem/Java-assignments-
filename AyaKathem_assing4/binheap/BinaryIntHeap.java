package AyaKathem_assing4.binheap;

public class BinaryIntHeap implements BinaryIntHeapInterface {
	
	
	
public static void main(String[] args) {
		
		BinaryIntHeap heap = new BinaryIntHeap();
		
		heap.insert(10);
		heap.insert(90);
		heap.insert(9);
		heap.insert(88);
		
		
		heap.insert(35);
		heap.insert(899);
		heap.insert(98);
		heap.insert(535);
	
		
		System.out.println(heap.toString());
		System.out.println("Size :"+heap.size());
		System.out.println("PullHighest :"+heap.pullHighest());
		System.out.println("PullHighest :"+heap.pullHighest());
		System.out.println("PullHighest :"+heap.pullHighest());
		System.out.println("PullHighest :"+heap.pullHighest());
		System.out.println("PullHighest :"+heap.pullHighest());
		
		//System.out.println("print "+heap.pullHighest());
		
		
		System.out.println(heap.toString());
		System.out.println("Size :"+heap.size());
		
	
		

	}

	public int[] heap = new int[20];
	private int size = 0;
	
	public int leftChildIndex;
	int maxIndex;	
	
	public void insert(int n){
		if(size  == heap.length){
			resize();
		}else {
			size++;
			heap[size] = n;
			moveUp(size);
		}
	}
	
	public int pullHighest() {
		if (size <1) { // if the array is empty throw exception 
			throw new IllegalArgumentException("Queue is Empty");
		}
		
		/*
		 * pick the first element 
		 * decrease the size, 
		 *save the last element instad of element at position one
		 */
		int highest = heap[1]; 
		heap[1] = heap[size];
		
		int[] temp = new int[heap.length];
		for (int i = 0; i < size ; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
		size--; 
		
		int index = 1;
		swap(index);
		return highest;
	}
	
	
	

	private void swap(int in) {
		int num = in * 2;
		
		// check if the in parameter is the last element of the array 
		// or the parameter index have no child 
		if (in == size  || num > size  ) {
			// if one of them true returen 
			return;
		}
		
		int left = heap[num];
		int right = heap[num + 1];
		
		//chek if the  element at parameter in is
		//greater or equal to both of its children
		if (heap[in] >= left && heap[in] >= right) {
			// if true retrun 
			return;
		} else { // else swap if the child is greater 
			if (left >= right) {
				int temp = heap[in];
				heap[in] = left;
				heap[num] = temp;
				swap(num);
			} else {
				int temp = heap[in];
				heap[in] = right;
				heap[num + 1] = temp;
				swap(num + 1);
			}
		}
	}
	
	
	/**
	 * Returns the current size of the heap.
	 * @return int size.
	 */
	public int size(){
		return size;
	}
	
	/*
	 * Returns true if the heap is empty.
	 */
	public boolean isEmpty(){
		return size <= 1;
	}
	/*
	 * ToString method to print the binaryint heap
	 */
	public String toString(){
		String output = "";
		for (int i = 1; i <= size; i++){
			if(i == size){
				output += heap[i];
			}else{
				output += heap[i] + ", ";
			}
			
		}
		
		return "[ " + output + " ]";
	}
	
	
	
	private void moveUp(int size){
		if(size/2 < 1){
			return;
		}
		if (size != 0){
			
			int p = size/ 2;
		
		if(heap[p] < heap[size]){
		int temp = heap[p];
		heap[p] = heap[size];
		heap[size] = temp;
		moveUp(p);
		} 
		}
	}
	
	/**
	 *Doubles the size of the array. 
	 */
	private void  resize() {
		int[] tmp = new int[2*heap.length];
		System.arraycopy(heap, 0, tmp, 0, heap.length);
		heap = tmp;
	}
	
	
	
	
	
}
