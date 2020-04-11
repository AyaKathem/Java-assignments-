/**
 * 
 */
package AyaKathem_assing4.Linkedqueue;
import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;
/**
 * @author Aya Kathem
 *
 */
public class QueueTest {
	LinkedQueue<String> stringTest = new LinkedQueue<String>();
	LinkedQueue<Integer> intTest = new LinkedQueue<Integer>();
	@Test
	public void testString() {
		
		assertTrue(stringTest.isEmpty());		
	}
	
	@Test
	public void testStringEnqueue() {
		
		stringTest.enqueue("hej");
		assertFalse(stringTest.isEmpty());
	}
	
	@Test
	public void testStringFirst() {
		stringTest.enqueue("hej");
		stringTest.enqueue("hejsan");
		assertEquals("hej", stringTest.first());
	}
	
	@Test
	public void testStringLast() {
		stringTest.enqueue("hej");
		stringTest.enqueue("hejsan");
		assertEquals("hejsan", stringTest.last());
	}
	
	@Test
	public void testStringDequeue() {
		
		stringTest.enqueue("hej");
		stringTest.enqueue("hejsan");
		assertEquals("hejsan", stringTest.last());
		stringTest.dequeue();
		stringTest.dequeue();
		assertTrue(stringTest.isEmpty());			
	}
	
	@Test
	public void testStringSize() {
		LinkedQueue<String> StringTest = new LinkedQueue<String>();
		for (int i = 0; i < 20; i += 1) {
			String s = Integer.toString(i);
			StringTest.enqueue(s);
		}
		assertEquals(20, StringTest.size());
	}

	
	// Integer queue
	@Test
	public void testInt() {
		
		assertTrue(intTest.isEmpty());		
	}
	
	@Test
	public void testIntEnqueue() {
		
		intTest.enqueue(1);
		assertFalse(intTest.isEmpty());
	}
	
	@Test
	public void testIntFirstLast() {
		
		intTest.enqueue(1);
		intTest.enqueue(2);
		intTest.enqueue(6);
		intTest.enqueue(5);
		assertEquals(Integer.valueOf(1), intTest.first());
		assertEquals(Integer.valueOf(5), intTest.last());
	}
	
	@Test
	public void testIntDequeue() {
		for (int i = 0; i < 20; i += 1) {
			intTest.enqueue(i);
		}
		assertEquals(Integer.valueOf(19), intTest.last());
		for (int i = 0; i < 20; i += 1) {
			intTest.dequeue();
		};
		assertTrue(intTest.isEmpty());			
	}
	
	@Test
	public void testIntSize() {
		
		for (int i = 0; i < 20; i += 1) {
			intTest.enqueue(i);
		}
		assertEquals(20, intTest.size());


		
	}
	public void iteratorTest() {

		GenericQueue<String> strQue = new LinkedQueue<String>();
		GenericQueue<Integer> intQue = new LinkedQueue<Integer>();
		strQue.enqueue("zero");
		strQue.enqueue("one");
		strQue.enqueue("two");
		strQue.enqueue("three");

		for (int i = 0; i < 50; i++) {
			intQue.enqueue(i);
			strQue.enqueue(" "+i);
		}
		
		Iterator<Integer> qInteger = intQue.iterator();
		Iterator<String> qString = strQue.iterator();
		int j = 0;
		while (qInteger.hasNext()) {
			assertEquals(j, (int) qInteger.next());
			j++;
		}

		int k = 0;
		while (qString.hasNext()) {
			assertEquals("" + k, qString.next());
			k++;
		}

		
		
		 GenericQueue<Integer> intQue1 = new LinkedQueue<Integer>();
		 GenericQueue<String> queueString1 = new LinkedQueue<String>();
			Iterator<Integer> it3 = intQue1.iterator();
			Iterator<String> stringQueue = queueString1.iterator();
			
			
			
			boolean r1 = false;
			boolean r2 = false;
			
			try {
				it3.next();
			} catch (Exception e) {
				r1 = true;
			}
			assertTrue(r1);
			
			try {
				stringQueue.next();
			} catch (Exception e) {
				r2 = true;
			}
			assertTrue(r2);
			assertEquals(false, it3.hasNext());
			assertEquals(false, stringQueue.hasNext());
		
		
		
		
		Iterator<String> it1 = strQue.iterator();

		assertTrue(it1.hasNext());

		assertEquals("zero", it1.next());

	
		Iterator<Integer> it4 = intQue.iterator();

		assertTrue(it4.hasNext());

		
		 assertEquals(0, (int)it4.next());


		

	}

}
