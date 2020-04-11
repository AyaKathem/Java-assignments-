package AyaKathem_assing4.Linkedqueue;

import java.util.Iterator;

public class linkedqusuMain {
	public static void main(String[] args) {

	LinkedQueue<Integer> TestInt = new LinkedQueue<Integer>();
	LinkedQueue<String> TestString = new LinkedQueue<String>();
     // Add element to the queue
	for (int i = 1; i <= 5; i++) {
		TestInt.enqueue(i);
	}
	TestInt.enqueue(7);
	TestInt.enqueue(22);
	TestInt.enqueue(10);
	
	System.out.println("The size of the queue: " + TestInt.size()); // check the size
	System.out.println("element of the queue: " + TestInt.toString());
	System.out.println("Last element: " + TestInt.last()); 
	System.out.println("Remove and Return first element: " + TestInt.dequeue());
	System.out.println("The new size of the queue: " + TestInt.size());
	for (int i = 1; i <= 3; i++) { // remove four element and returen the first elemet after every time dequeue
		System.out.println("Remove and Return first element: " + TestInt.dequeue());
	}
	
	System.out.println("Remove and Return first element: " + TestInt.dequeue());
	System.out.println("First element: " + TestInt.first()+ "  Last element: " + TestInt.last());
	System.out.println("String: " + TestInt.toString());
	Iterator<Integer> ite = TestInt.iterator();
	while (ite.hasNext()) {

		System.out.println(ite.next());

	}

	

	for (int i = 1; i <= 15; i++) {
		TestString.enqueue("" + i);
		
	}
	
	System.out.println("The size of the queue: " + TestString.size());
	System.out.println("element of the queue: " + TestString.toString());
	System.out.println("Last element: " + TestString.last());
	System.out.println("Remove and Return first element: " + TestString.dequeue());
	System.out.println("The new size of the queue: " + TestString.size());
	System.out.println("First element: " + TestString.first() + "   Last element: " + TestString.last());
	for (int i = 1; i <= 7; i++) { // remove seven element and returen the first elemet after every time dequeue
		System.out.println("Remove and Return first element: " + TestString.dequeue());
	}
	
	System.out.println("First element: " + TestString.first() + "   Last element: " + TestString.last());
	System.out.println("String: " + TestString.toString());
	
	Iterator<String> it = TestString.iterator();
	while (it.hasNext()) {

		System.out.println(it.next());

	}

}
}
