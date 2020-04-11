package ak223ej_assign1;

import java.util.Scanner;


/**
 * @author Aya Kathem
 *
 */
public class sumMain {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter the start number you wante to sum : ");
		int n1= input.nextInt(); //get the start number 
		System.out.print("enter the  number you wante to sum : ");
		int n2= input.nextInt();
		
		System.out.println("The summation is:"+ sum(n1, n2));
		
		input.close();
	}

	public static int sum(int sNum,int Num ) {
//recursion mefthod 
		if (sNum == Num )	 //when the sNum equal to Num the recursion end	 
			return sNum;
		else if (Num -sNum==1)	 
			return Num +sNum;

		else{ //calculates 
			int Cumpute=(sNum-1+Num)/2;	
			return sum (sNum,Cumpute)+sum((((sNum-1+Num)/2)+1),Num);
		}
/*it's not a good way to compute becouse it will split each method into two in each step  
 * it is slow memory 
 * This recursion method will large exponentially and good to high number
 * 
 */
	}

}
