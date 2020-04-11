package AyaKathem_assing4.time;

import java.lang.System;

public class ConcatenationsEX2 {
	
	public static void main(String[] args) {
 
		/* Described this all in report */
		
		String test2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String test1 = "a";
		for (int i = 0; i < 5; i++) {

			//stringWithOneCharacter(test1);		
			stringWith80Characters(test2);
			//stringBuilderWithOneCharacter(test1);
			//stringBuilderWith80Character(test2);

		}

		/* Extra */
		// System.out.println("Average Time: " + getAverage(time) + " Average	 Length: " + getAverage(arrayLength));

	}
	
	
	private static int time = 1000;
	
	/**
	 * an method repeat concatenations
	 *using plus operator
	 *with checking time in millisecond 
	 * @param str
	 */
	public static void stringWithOneCharacter(String str) {
		String string = "";
		long start = System.currentTimeMillis();
		int count =0;
		while (System.currentTimeMillis() - start < time) {
			string = string + str;
			count++;
		}
	
		
		long end = System.currentTimeMillis()- start;
		System.out.println("Approximate time: " + end + " milliseconds." + " Total concatenations in every loop: "
				+ count +" all the printed"+"  Total length: " + string.length() + "\n");

		
	}
	
	/**
	 * an method repeat concatenations
	 *using plus operator
	 *with checking time in millisecond 
	 * @param str
	 */
	public static void stringWith80Characters(String str) {
		int count = 0;		
		long start = System.currentTimeMillis();
		String string = "";
		while (System.currentTimeMillis() - start < time) {
			string = string + str;
			count++;
			
		}
		
		long end = System.currentTimeMillis()- start;
		System.out.println("Approximate time: " + end + " milliseconds." + "  Total concatenations: "
			 +count +".  Total length: " + string.length() + "\n");

		}

	/**
	 * an method repeat concatenations
	 *using stringBuilder
	 *with checking time in millisecond 
	 * @param str1
	 */
	public static void stringBuilderWithOneCharacter(String str1) {

		StringBuilder str = new StringBuilder();
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < time) {
			
			str.append(str1);
		    str.toString();
		}
		long end = System.currentTimeMillis() -start;

		long begin = System.currentTimeMillis();
		str.toString();
		long finish = System.currentTimeMillis();
		long toStringTime = (finish - begin);

		


		System.out.println("Before ToString:  Approximate time: " + end + " milliseconds."
				+ " Total concatenations: " + str.length() + ".  Total length: " + str.length());
		System.out.println("ToString time: " + toStringTime + " milliseconds.");
		
		
	}
	
	/**
	 * an method repeat concatenations
	 *using stringBuilder
	 *with checking time in millisecond 
	 * @param str1
	 */
	public static void stringBuilderWith80Character(String str1) {

		StringBuilder str = new StringBuilder();
		
		int count =0;
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < time) {
			str.append(str1);
		
			count++;
		}
		long end = System.currentTimeMillis()- start;

		long begin = System.currentTimeMillis();
				   str.toString();
		
		long finish = System.currentTimeMillis();
		long toStringTime = (finish - begin);

		
		System.out.println("Before ToString:  Approximate time: " + end + " milliseconds."
				+ " Total concatenations: " + count + ".  Total length: " + str.length());
		System.out.println("ToString time: " + toStringTime + " milliseconds.");
		

	}
	
	

}


