package AyaKathem_assing3;

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

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoInterface extends Application {
	@Override
	public void start(Stage primaryStage){
		VBox root = new VBox();
		HBox path = new HBox();
		
		Label insertL = new Label("Insert Path");
		path.setPadding(new Insets(60,10,10,10));
		TextField wPath = new TextField(" ");
		
		//C:/Users/to_ta/workspace/1DV507/src/AyaKathem_assign3/ayt.txt
		//C:\Users\to_ta\workspace\1DV507\src\AyaKathem_assing3\ayt.txt
		wPath.setPrefSize(300, 20);
		path.setSpacing(20);
		Button btn = new Button("Bin Chart");
		Button btn1 = new Button("Pia Chart");
		/*
		 * create two button 
		 * one to display binchart
		 * the other one is to displY Pia chart 
		 */
		Alert alert = new Alert(AlertType.ERROR); 
		
		
	 btn.setOnAction((ActionEvent e) -> {
		 File digitFile = new File(wPath.getText());
			 Scanner s = null;
			try {
				s = new Scanner (digitFile);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				alert.setHeaderText("Error" ); 
				/*
				 * display an alert if the path is not found 
				 * 
				 */
				alert.setContentText("The Path is not found, Please try again!"); 
				/*
				 * the user will returen back to the interface 
				 */
				alert.showAndWait();
				e1.printStackTrace();
			}
			 
			 
					chatProcess(s);
					barChart();
			});
		
	 btn1.setOnAction((ActionEvent e) -> {
		 File digitFile = new File(wPath.getText()); 
			 Scanner s = null;
			try {
				s = new Scanner (digitFile);
			} catch (FileNotFoundException e1) { 
				// TODO Auto-generated catch block
				alert.setHeaderText("Error" );
				alert.setContentText("The Path is not found, Please try again!");
				alert.showAndWait();
				e1.printStackTrace();
			}
			 
			 
					chatProcess(s);
					pieChart();
			});
	 
	 
	 
	 
		path.getChildren().addAll(insertL,wPath, btn,btn1);
		root.getChildren().add(path);
		primaryStage.setTitle("Chart Display");
		primaryStage.setScene(new Scene(root,700,150));
		primaryStage.show();
		
	}
	
	
	int one = 0, two = 0, three = 0, four = 0, five = 0,
            six = 0, seven = 0, eight = 0, nine = 0, ten = 0, other = 0;
	
	public void chatProcess (Scanner in){
		
	
	
		
		while ((in.hasNextInt())) {// while the index is digit 
			int num = in.nextInt();		
				/* count how many numbers 
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
		
		
		
		
	}
	
	// a mothod to display binchart 
	
	public void barChart(){
		
		
		 CategoryChart chart = new CategoryChartBuilder().width(800).
		            height(600).xAxisTitle("Interval").
		            yAxisTitle("Amount").build();

		    //Customize chart
		    chart.getStyler().setHasAnnotations(true);
		    chart.getStyler().setLegendVisible(false);

		    //adding series to the chart
		    chart.addSeries("Numbers", Arrays.asList(new String[] { "0-10", "11-20", "21-30", "31-40",
		                    "41-50", "51-60", "61-70", "71-80", "81-90", "91-100", "Other"}),
		            Arrays.asList(new Integer[] {one, two, three, four, five, six, seven, eight, nine, ten, other}));

		    new SwingWrapper(chart).displayChart(); //displayChart
		
		
		
		
		
		
		
		
		
	}
	
	//a mathod to display the pie chart 
	public void pieChart(){
		  PieChart chart1 = new PieChartBuilder().width(800).height(600).build();

		    //Customize chart
		    chart1.getStyler().setLegendVisible(false);
		    chart1.getStyler().setAnnotationDistance(.82);
		    chart1.getStyler().setPlotContentSize(.9);
		    chart1.getStyler().setAnnotationType(PieStyler.AnnotationType.LabelAndPercentage);

		    chart1.addSeries("0-10", one);
		    chart1.addSeries("11-20", two);
		    chart1.addSeries("21-30", three);
		    chart1.addSeries("31-40", four);
		    chart1.addSeries("41-50", five);
		    chart1.addSeries("51-60", six);
		    chart1.addSeries("61-70", seven);
		    chart1.addSeries("71-80", eight);
		    chart1.addSeries("81-90", nine);
		    chart1.addSeries("91-100", ten);
		    chart1.addSeries("Other", other);

		    new SwingWrapper(chart1).displayChart();
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
