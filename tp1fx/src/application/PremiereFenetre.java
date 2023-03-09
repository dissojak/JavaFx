package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class PremiereFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Group group = new Group();
            Rectangle rec=new Rectangle(100, 100, 100, 100);
            rec.setFill(Color.BLACK);
            Line ly=new Line(10, 10, 100, 100);
            Circle cr=new Circle(20, 10, 10);
            
            group.getChildren().addAll(rec, ly, cr);
            root.setCenter(group);
            
            Scene scene = new Scene(root,300,250,Color.WHITE);
            primaryStage.setTitle("Ma première fenêtre");    
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
}
