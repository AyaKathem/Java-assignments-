package AyaKathem_assing4.time;

import java.util.Random;


import org.apache.commons.lang.RandomStringUtils;



public class insertionSortEx {
	
	
	
	public static void main(String[] args) {
	
		int[] arr = new int[10000];
		Random rnd = new Random(arr.length *2);
	
		
		int totalLength =0;
		//random ganerter fo fill array 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(arr.length * 2);

	}
	
	
		long runTime = 0;
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 998)  {	
			insertionSort(arr);
		long end = System.currentTimeMillis();
			runTime =  (end - start);
			totalLength += arr.length;
			System.out.println("Integer insertion sort required : " + runTime + " milliseconds. Total length: " + totalLength);
			
		}


	
	long before =0;
	long after = 0;
	long total = 0;
	int in =0;
    String[] stringArray =sGenerator(2000);
    before = System.currentTimeMillis();
    while (System.currentTimeMillis() - before < 998)  {	
			
			insertionSort(stringArray);
			after = System.currentTimeMillis();
			total = (after - before);
			in += stringArray.length;
			 System.out.println("String insertion sort required :" +(total ) + " milliSeconds. total length: " + in);
	}
	
	 //help code to check if the insertion methods work correctly

    /* int[] arr2 =  insertionSort(arr);;
     for(int i: arr2){
         System.out.print(i);
         System.out.print(", ");
     }*/
	
    /* String[] arr3 =  insertionSort(stringArray);
    for(String i: arr3){
        System.out.print(i);
        System.out.print(", ");
    }*/
 
	 
	}
	public static String[] sGenerator(int size) {
		String[] arr = new String[size];

		for (int i = 0; i < size; i++)
			arr[i] = RandomStringUtils.randomAlphabetic(27);

		return arr;

	}
	

	
	//Copied from Bok Big Java
	
	/**
	 *  Insertion sort method for integer array 
	 * @param arr
	 * @return an array of sort data
	 */
	public static int [] insertionSort(int[] arr) {
		//new array with same size
		int[] in = new int[arr.length];
		System.arraycopy(arr, 0, in, 0, arr.length);
		
		for (int i =1 ; i <in.length ; i++)
		{
			int next = in[i];
			int j= i;
			while(j >0 && in[j-1]> next)
			{in[j] = in[j-1];
			j--;
			
				
			}
			in[j]= next ;
		}
		return in;
	    }
	
	
	/* Insertion sort method for String array */
	/**
	 *  Insertion sort method for string array 
	 * @param arr
	 * @return an sort string array 
	 */
	public static String[]  insertionSort(String[] in) {
		String[] arr = new String[in.length];
		System.arraycopy(in, 0, arr, 0, in.length);
         String temp;
         
         for (int i = 1; i < arr.length ; i++){  
        	 /*
				 * Arrange elements.
				 */
              temp = arr[i];
              int j = 0;
              for(j = i; j > 0; j--)
                   if(temp.compareTo(arr[j - 1]) < 0)
                	   arr[j] = arr[j - 1];
                   else
                       break;
              arr[j] = temp;
              
          
         }
       return arr;
    }

	
	
	
	
	

}
