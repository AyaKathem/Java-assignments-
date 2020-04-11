package AyaKathem_assing3.Exercises3_7;

//C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assing3/HistoryOfProgramming.txt
//
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class IdentyfyWordsMain {
	public static void main(String[] args) throws IOException {
		
		Scanner Scan = null;
		// get the url 
		try {
			URL url = new URL("http://homepage.lnu.se/staff/jlnmsi/java2/HistoryOfProgramming.txt");
			Scan = new Scanner(url.openStream());
			
			} catch (FileNotFoundException  e1) {//exception if the url is not found
			e1.printStackTrace();
		}
		
		
			//String myFile = "C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assing3/word.txt";
			StringBuilder s = new StringBuilder();
			checkText(Scan, s);
		
	try {	// filewriter to print the content of url to word file
			FileWriter fileW  = new FileWriter( "C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assing3/word.txt");
			PrintWriter p = new PrintWriter( fileW); 
			p.print(s.toString());
			p.close();
		} catch (FileNotFoundException e) {
			 System.out.println( "Error"  + "'");

			e.printStackTrace();
		}
}
	
	
	
	public static void checkText(Scanner in,StringBuilder sb){
		
		while (in.hasNext()) {
// get the input of the scanned url 
			String t = in.nextLine();			
			int line = t.length();
			
			for (int i = 0; i < line ; i++) {
				if (Character.isLetter(t.charAt(i))) // if it is a litter add it 
					sb.append(t.charAt(i));
				
				else if (Character.isWhitespace(t.charAt(i))) // if there is a space so add a space
					sb.append(" ");

			}
			sb.append("\n");

		}
		
	}
}