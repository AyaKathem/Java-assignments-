package AyaKathem_assing3;

import java.util.Random;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CatchTheCreature  extends Application{
	
	  
	    private EventHandler<ActionEvent> move;
	    Pane pane = new Pane() ;
		private Timeline timeline = new Timeline();
		private int count =0;
	    public void start(final Stage stage) {

	    	// an image view to display the image
	    	ImageView iv1 = new ImageView(new Image("http://icons.iconarchive.com/icons/designbolts/despicable-me-2/64/Minion-Crazy-icon.png"));
	    	
	    	
	    	VBox p = new VBox(); 
	    	
	    	/**
	    	 * create vbox
	    	 * to set the pane to 
	    	 */
	    	VBox root3 = new VBox();
	        pane.getChildren().addAll(iv1);
	        root3.setPrefSize(500, 700);
	        root3.getChildren().add(pane);
	        root3.setStyle("-fx-background-color: rgb(90, 134, 244);");
	        
	        
	      /*
	       * create hbox to arranging a series of nodes in a single row
	       * set layout 
	       */
	      
	        HBox root = new HBox();
	        root.setPrefSize(700, 70);
	        root.setStyle("-fx-background-color: rgb(90, 134, 244);");
	        root.setAlignment(Pos.BOTTOM_CENTER);
	        root.setSpacing(40);
	        
	        HBox root2 = new HBox();
	        root2.setPrefSize(700, 100);
	        root2.setAlignment(Pos.BOTTOM_CENTER);
	        root2.setStyle("-fx-background-color: rgb(21, 47, 112);");
	        
	        Button btn1 = new Button("Start");
	        Button btn2 = new Button("Result");
	        btn1.setPadding(new Insets(10,150,10,150 ));
		    btn2.setPadding(new Insets(10,144,10,144));
		    /**
		     * set a text 
		     * get the result of the game
		     */
	        Text t = new Text(" ");
	        t.setFill(Color.LAVENDER);
	        t.setFont(new Font(50));	

		    
	        
	        stage.setTitle("CatchTheMinions");
	        root.getChildren().addAll(btn1,btn2);
	        root2.getChildren().add(t);
	        p.getChildren().addAll(root, root2 ,root3);
	       
	        Scene scene = new Scene(p, 700, 700);

	        
	       
	        
	        
		
			
	        KeyValue keyValueX = new KeyValue(iv1.scaleXProperty(), 0);
			KeyValue keyValueY = new KeyValue(iv1.scaleYProperty(), 0);
		    timeline.setCycleCount(Timeline.INDEFINITE);
			/* 
			 *  set the Speed
			 */
			Duration duration = Duration.millis(600);
			moveCreature();
	
			
			KeyFrame key = new KeyFrame(duration, move, keyValueX, keyValueY);
			timeline.getKeyFrames().add(key);
			timeline.setAutoReverse(true);
			
			 
			  btn1.setOnAction((ActionEvent e) -> { // when the player press on strat the game started
				  	timeline.play();
				  	
				});
			  
			  iv1.setOnMouseClicked(e2 -> {
				  count++; // count every time the player cathch the creature 
				});
			  
			  btn2.setOnAction((ActionEvent e) -> {	 // when the user press on the result button the total will display 
				  t.setText("" + count);
				  timeline.stop();
				});
			
			  
	        stage.setScene(scene); 
	        stage.show();
	    }

	  
	    

	 
	    private void moveCreature() {
			move = new EventHandler<ActionEvent>() {
				Random rand = new Random();

				public void handle(ActionEvent t) { // display the image in random places in the pane 
					pane.setTranslateX(rand.nextInt(500));
					pane.setTranslateY(rand.nextInt(500));

				}
			};
		}
	    
	    

	    // launch application
	    public void launch(Class<UpDownMain> upDownMainClass) {
	        launch();
	    }

}
