package ak223ej_assign1;

public class PascalMain {
	
	
	
	public static void main(String[] args)  {
		int[] arr = passcalRow(8); 
		print(arr);
		
		  
	}

	public static int[] passcalRow(int n)  {
		
		int [] pNUM ;
								
		if (n< 0 ){
			System.out.print("The number have to be postive"); // display error 
		}
		
		
		else if (n == 0) { 		 // final condition
			 pNUM = new int [1];
			 pNUM[0] = 1; 	
			return pNUM;
		}

		
		
		
		pNUM = new int[n + 1];
		//use the recursion 
		int[] array = passcalRow(n - 1);
		//start element and last element should be 1 								
		pNUM[0] = 1;			
		pNUM[n] = 1;
		for (int i = 1; i < n; i++) {

			pNUM[i] = array[i - 1] + array[i];									
		}
		return pNUM;

	}



	
	
	
	public static void  print (int[] n){ 
		//method to print the array
		for (int i = 0; i < n.length; i++)
				System.out.print(n[i]+ " ");
	}
}