package ak223ej_assign1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.IOException;
import java.util.Scanner;
public class PrintJavaMain {

	
	public static void main(String[] args) throws IOException {
		
		//get the file 
		String fileIn = "C:/Users/to_ta/workspace";
		File theFile = new File(fileIn);
		printAllJavaFiels(theFile);

	}

	
	public static void printAllJavaFiels(File directory) throws IOException  {
		
		
	
		ArrayList <File> subD = null ;
	
		if (directory.isDirectory()){ // get directoy 
			
			subD = new ArrayList<File>(Arrays.asList(directory.listFiles()));
			/*
			 * stor them in the array list
			 * 
			*/  
			
			for(File f: subD) 
				//use recurision to print all files and sub files
				
				printAllJavaFiels(f); 
			
		}
		
		
		
		String fileName = directory.getName();
		 // get the directory name
		if (fileName.endsWith(".java")) {		 	
			/*if it is a java file
			 * scanne the file 
		*/
			
			
		
			System.out.println(fileName + "\t\t  :"  + 	countlines(directory) + " Lines number");
		
		}

	}
	
	//method to count how many lines in each java file
	private static int countlines(File in ){
		int numOfLine = 0;
		try {
			Scanner sc = new Scanner(in);
			
			while (sc.hasNextLine()) { 
				sc.nextLine();
				numOfLine++;
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return numOfLine;
}
}

