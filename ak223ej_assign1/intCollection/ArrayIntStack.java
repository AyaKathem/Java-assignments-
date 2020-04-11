package ak223ej_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	// add element and resize in case it needed
	@Override
	public void push(int n){
		if (size == values.length)
			resize();
		values[size++] = n;
	}

	/*throw exeception if the stack is empty 
	 * else return top element
	 *  */
	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (isEmpty() == true )
			throw new IndexOutOfBoundsException("your stack is empty");
		int return1=values[size--];
		return return1;
	}

	/*throw exeception if the stack is empty 
	 * else return last element
	 *  */
	@Override
	public int peek() throws IndexOutOfBoundsException {
		if (isEmpty())
			throw new IndexOutOfBoundsException();
		return values[size];
	}
	//retuen size of the stack 
	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return super.isEmpty();
	}

}
