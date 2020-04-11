package AyaKathem_assing3.Exercises3_7;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount1Main {
	public static void main(String[] args) {
		//get file path
		File inputWords = new File( "C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assing3/word.txt");
		
		HashSet<Word> hset = new HashSet<Word>();
		TreeSet<Word> tree = new TreeSet<Word>();
		
		
		
		
		 try 
		 {
			 Scanner fileScan = new Scanner(inputWords);//scan file
  
			 if (inputWords.length() > 0){ // if the file is not empty 
					
					while(fileScan.hasNext()) {
							
							//input = fileScan.next();
							Word word = new Word(fileScan.next());
							/**
							 * stor the conten 
							 * in hash and tree set
							 */
							hset.add(word);
							tree.add(word);
						}
						fileScan.close(); 
			 }
			 
		 }catch(FileNotFoundException e) { // exception if the file is not found 
				e.printStackTrace();
			}
		 
		//print 
		System.out.println("Hash size: "+ hset.size());
		System.out.println("Tree size: " + tree.size());
		System.out.print("Tree data: ");
	 
		// Displaying the Tree set data
		Iterator<Word> t = tree.iterator();
		while (t.hasNext()) {
			System.out.print(t.next() + " ");
		}
		
	}

}