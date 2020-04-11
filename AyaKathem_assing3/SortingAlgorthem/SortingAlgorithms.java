package AyaKathem_assing3.SortingAlgorthem;

public class SortingAlgorithms {
	
	
	//Copied from Bok Big Java
		/** Insertion sort method for integer array 
		 * @param int [] in
		 * @returen sort integer array 
		 * */
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
		
		
		/** Insertion sort method for String array 
		 * @param String [] in
		 * @returen  sort string array 
		 * */
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
