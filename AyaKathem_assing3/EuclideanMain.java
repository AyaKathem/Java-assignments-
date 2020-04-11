/**
 * 
 */
package AyaKathem_assing3;

/**
 * @author Aya Kathem 
 *
 */
public class EuclideanMain {
	
public static void main(String[] args) {
	// main to test the recursion mathod
		int x = 18; 
		int y = 12;
	System.out.println("The greatest common divisor : "+GCD(x,y));
		int x1 = 42;
		int y1 = 56;
	System.out.println("The greatest common divisor : "+GCD(x1,y1));
		int x2 = 9;
		int y2 = 28;
	System.out.println("The greatest common divisor : "+GCD(x2,y2));
		

	}
/** A recursion mathod 
 *  @return GCD
*/
	private static int GCD(int A, int B) {
		
		if (B == 0) {
			return A;
		}
		else {
			return GCD(B, A % B);		// recursion here
		}
	}



}
