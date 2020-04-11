package ak223ej_assign1;

import java.io.File;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.PieStyler;

public class SinMain {
	public static void main(String[] args) throws FileNotFoundException
    {
		
		
		//get the file 
		File digitFile = new File("C:/Users/to_ta/workspace/1DV507/src/ak223ej_assign1/ayt.txt");
		// Scanner to read the fle 
		Scanner in = new Scanner(digitFile);
		//create varibles 
		 int one = 0, two = 0, three = 0, four = 0, five = 0,
	              six = 0, seven = 0, eight = 0, nine = 0, ten = 0, other = 0;
		
		 
		
		
		while ((in.hasNextInt())) {// while the index is digit 
			int num = in.nextInt();		
				/*
				 *  count how many numbers   
				 * in every categories of number  
				 * then count the numbers that bigger than 100
				 */
				
				if (num <= 10) {
		              one++;
		          } else if (num > 10 && num <= 20) {
		              two++;
		          } else if (num > 20 && num <= 30) {
		              three++;
		          } else if (num> 30 && num <= 40) {
		              four++;
		          } else if (num > 40 && num <= 50) {
		              five++;
		          } else if (num> 50 && num<= 60) {
		              six++;
		          } else if (num > 60 && num <= 70) {
		              seven++;
		          } else if (num > 70 && num <= 80) {
		              eight++;
		          } else if (num > 80 && num <= 90) {
		              nine++;
		          } else if (num > 90 && num <= 100) {
		              ten++;
		          } else {
		              other++;
		          }
			
				
		}
		//create a chart and set layout 
		 CategoryChart Bchart = new CategoryChartBuilder().width(800).
		            height(600).xAxisTitle("Interval").
		            yAxisTitle("Amount").build();

		    //Customize chart
		 Bchart.getStyler().setHasAnnotations(true);
		 Bchart.getStyler().setLegendVisible(false);

		     	// add numbers categories
		 Bchart.addSeries("Numbers", Arrays.asList(new String[] { "0-10", "11-20", "21-30", "31-40",
		                    "41-50", "51-60", "61-70", "71-80", "81-90", "91-100", "Other"}),
		            Arrays.asList(new Integer[] {one, two, three, four, five, six, seven, eight, nine, ten, other}));

		    new SwingWrapper(Bchart).displayChart(); //display Chart

		  //creating and Set the layout to piechart
		    PieChart Pchart = new PieChartBuilder().width(800).height(600).build();

		    //set layout
		    Pchart.getStyler().setLegendVisible(false);
		    Pchart.getStyler().setAnnotationDistance(.82);
		    Pchart.getStyler().setPlotContentSize(.9);
		    Pchart.getStyler().setAnnotationType(PieStyler.AnnotationType.LabelAndPercentage);
		 // add numbers categories
		    Pchart.addSeries("0-10", one);
		    Pchart.addSeries("11-20", two);
		    Pchart.addSeries("21-30", three);
		    Pchart.addSeries("31-40", four);
		    Pchart.addSeries("41-50", five);
		    Pchart.addSeries("51-60", six);
		    Pchart.addSeries("61-70", seven);
		    Pchart.addSeries("71-80", eight);
		    Pchart.addSeries("81-90", nine);
		    Pchart.addSeries("91-100", ten);
		    Pchart.addSeries("Other", other);

		    new SwingWrapper(Pchart).displayChart();
		    	in.close();
	
	}
}