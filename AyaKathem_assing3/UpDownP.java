package AyaKathem_assing3;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class UpDownP extends Application {

    private static GridPane grids;
    private int row =3, column = 3;
   
   
    public void start(final Stage stage) {

    	//get the image to display
    	ImageView iv1 = new ImageView(new Image("http://icons.iconarchive.com/icons/mazenl77/I-like-buttons-3a/128/Cute-Ball-Games-icon.png"));
    	Pane pane = new Pane() ;
        pane.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(goldenrod, 20%), derive(goldenrod, -40%));");
        /*
         * set layout
         */
        iv1.setFitHeight(100);
        iv1.setFitWidth(100);
        iv1.relocate(0, 2);
        
        pane.getChildren().addAll(iv1);
        
        
        grids = new GridPane();
        grids.setStyle("-fx-grid-lines-visible: true");
        for(int i = 0; i < 7; i++) {
        	/* initialize rows and columns
        	 * divid the pane to 7*7
        	 * the size will be 100*100
        	 */
            ColumnConstraints column = new ColumnConstraints(100);
            grids.getColumnConstraints().add(column);
            RowConstraints row = new RowConstraints(100);
            grids.getRowConstraints().add(row);
        }       
        stage.setTitle("UppDownPane");
     
    

        Scene scene = new Scene(grids, 700, 700, Color.BEIGE);

        grids.add(pane, row, column); 

     
        scene.setOnKeyPressed(e -> { // press on key to move 

            if(e.getCode().equals(KeyCode.LEFT)) { 
                row -=  1;
                if (row < 0) { 
                                
                    row = 6;// move to the other side
                }
            }
            else if (e.getCode().equals(KeyCode.RIGHT)) {
                row += 1;
                if (row > 6) {
                    row = 0;
                }
            }
            else if (e.getCode().equals(KeyCode.DOWN)) {
                column += 1;
                if (column > 6) {
                    column= 0;
                }
            }
            else  if (e.getCode().equals(KeyCode.UP)) {
                column -= 1;
                if (column < 0) {
                    column = 6;
                }
            }
            grids.getChildren().remove(pane);
            grids.add(pane, row, column);

        });

        stage.setScene(scene);
        stage.show();
    }

  
    

 

    // launch application
    public void launch(Class<UpDownMain> upDownMainClass) {
        launch();
    }
}



