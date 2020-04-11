/**
 * 
 */
package AyaKathem_assing4.binheap;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author Aya Kathem
 *
 */
public class HeapTest {
BinaryIntHeap heap = new BinaryIntHeap();
	
@Test
public void insertT() {
	BinaryIntHeap bh = new BinaryIntHeap();
	bh.insert(5);
	bh.insert(3);
	bh.insert(9);
	bh.insert(2);
	assertEquals("expexted size of the array is 4 ",4,bh.size());
	
	
	
	
	assertEquals("[ 9, 3, 5, 2 ]", bh.toString());
	bh.insert(60);
	bh.insert(88);

	assertEquals("[ 88, 9, 60, 2, 3, 5 ]", bh.toString());
	


}
@Test
public void tPull(){
	BinaryIntHeap heap = new BinaryIntHeap();
	
	
	
	heap.insert(2);
	heap.insert(3);
	heap.insert(155);
	heap.insert(5);
	heap.insert(6);
	heap.insert(7);
	assertEquals(155, heap.pullHighest());
	assertEquals(7, heap.pullHighest());
	assertEquals(6, heap.pullHighest());
	
	assertEquals(3, heap.size());

	
}
	@Test
	public void tResize(){
		BinaryIntHeap heap = new BinaryIntHeap();
		assertEquals(0, heap.size());
		heap.insert(3);
		heap.insert(4);
		heap.insert(5);
		heap.insert(6);
		heap.insert(7);
		assertEquals(5, heap.size());
		
	}
	
	public void TestEmpty(){
		
		BinaryIntHeap heap1 = new BinaryIntHeap();
		assertEquals(true, heap1.isEmpty());
		
		heap.insert(4);
		assertEquals(false, heap1.isEmpty());
		
	}
	
	
	
	
}

