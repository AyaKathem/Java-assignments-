package ak223ej_assign1;

import java.util.ArrayList;
import java.util.List;


import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;


public class ScatterPlot{
	
	
	
	public static void main(String[] args) {
	    // Create and Customize Chart
		XYChart chart = new XYChartBuilder().width(800).height(600).build();
		chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Line);
		chart.getStyler().setMarkerSize(1);
		
	    
	    // Generate data
	    List xData = new ArrayList();
	    List yData = new ArrayList();
	    double lowerLimit = 0.0;
		double upperLimit = 2 * Math.PI;
		double xValue = lowerLimit;
		
		
		for (double i= 0.0 ; (xValue += 0.01) <= upperLimit ; i++ ) {
			xData.add(xValue);
			yData.add((1 + xValue/Math.PI)*Math.cos(xValue)*Math.cos(40*xValue));
		}
		
		
		chart.addSeries("Cosine curve", xData, yData);
		new SwingWrapper(chart).displayChart();
	}
	
	
			
}
