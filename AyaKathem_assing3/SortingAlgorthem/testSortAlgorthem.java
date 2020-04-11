package AyaKathem_assing3.SortingAlgorthem;

import static org.junit.Assert.*;
import org.junit.Test;
public class testSortAlgorthem {
	


	/*A test method that tests insertion test for integers*/
	@Test
	public void integerInsertionSortTest() {
		
		int[] array ={-4, -2, 23, 9, 0, 2, 45, 3, 90 };
		int[] arraySorted = { -4, -2, 0, 2, 3, 9, 23, 45 ,90 };
		
		assertArrayEquals(arraySorted, SortingAlgorithms.insertionSort(array));
		SortingAlgorithms.insertionSort(array);
		assertTrue(array[0] <= array[1]);
	}

	
		

	/*A test method that tests insertion test for string*/
	@Test
	public void stringInsertionSortTest() {
		
		 String[] alp = { "n", "h", "z", "a", "w", "o" };
		 String[] namesSorted = { "a", "h", "n", "o", "w", "z" };
		
		assertArrayEquals(namesSorted, SortingAlgorithms.insertionSort(alp));
		assertEquals(namesSorted.length, SortingAlgorithms.insertionSort(alp).length);
		//Normal "few" element test.
			
	}
	
	
}
