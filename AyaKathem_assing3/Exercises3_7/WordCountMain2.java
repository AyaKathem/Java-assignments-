package AyaKathem_assing3.Exercises3_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WordCountMain2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = null;
		List<Word> text = new ArrayList<>();
		TreeWordSet tS = new TreeWordSet();
		HashWordSet hS = new HashWordSet();
		
		File inputWords = new File( "C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assing3/word.txt");
		scan= new Scanner(inputWords);
			
				
		
		while(scan.hasNext()) {
			text.add(new Word(scan.next())); //go though the file index
			for(Word w : text) {
				hS.add(w); //add the text to hash set
				tS.add(w);	//add the text to tree
			}
			
			
		}
		
		scan.close();
				
		 // print the size
		System.out.println("TreeSet: "+tS.size());
		System.out.println("Hash : "+hS.size());
		Iterator<Word> iterator = tS.iterator();
	   //Iterator<Word> iterator2 = h.iterator();
		System.out.println("\t ");
		int i = 0;
		while(iterator.hasNext()) {
			System.out.println(++i + ": "+ iterator.next() + " ");
		}
		
		System.out.println();
		
	}
}