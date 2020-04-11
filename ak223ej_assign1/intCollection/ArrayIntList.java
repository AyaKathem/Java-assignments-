package ak223ej_assign1.intCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {
	/**
	 * method for add element 
	 * and check if array is full
	 */
	
	@Override
	public void add(int n) {
		if (super.size ==values.length) {
		resize(); // Call resize() mathod. if the is full 
		}
		values[size++] = n; // add integer 
		

	}

		/**
		 * add an element at specific position 
		 */
	@Override
	public void addAt(int n, int num) throws IndexOutOfBoundsException {
		
		if (size == values.length)
			resize();
		
		if (checkIndex(num, size + 1) == true) { //add one to size so we can add elemeny at index 0 when array is empty
			int i = size;
			while ( i >= num){
				--i;
				values[i + 1] = values[i]; //move the the element
			}
			values[num] = n; // add index at specific postition
			size++; //count 
		} else
			throw new IndexOutOfBoundsException(); //throw excption 
	}
	
	/**
	 * remove element
	 */
	@Override
	public void remove(int in) throws IndexOutOfBoundsException{
		if (!checkIndex(in, super.size)) {
			throw new IndexOutOfBoundsException(); 
		}else if (checkIndex(in, size)==true) {
			int i = in;
			while (i < size){
			 i++;
				values[i] = values[i + 1]; //just replace the element
			}
			super.size--;
		}
	}
	

	@Override
	public int get(int in) throws IndexOutOfBoundsException {
		if (!checkIndex(in, super.size)){
			  throw new IndexOutOfBoundsException("Index " + in
	                    + " is out of bounds!");
		}
		return super.values[in];
	}


	public int size() {

		return super.size();
	}

	
	public boolean isEmpty() {

		return super.isEmpty();
	}

	/**
	 * create an array storing the size
	 * then run for loop and if existing 
	 * return i 
	 * else
	 * return -
	 */
	@Override
	public int indexOf(int n) {
		int[] array = new int[size];			 
		int position = 0;
		
		for (int i = 0; i <= size; i += 1) {
			if (get(i) == n) {
				array[position] = i;
				return position = array[position];			
			}
		}
		return -1;
	}


}
