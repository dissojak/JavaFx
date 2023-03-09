public class PremiereFenetre extends Application {
@Override
public void start(Stage primaryStage) {
Group root = new Group();
Scene scene = new Scene(root, 300, 250, Color.WHITE);
primaryStage.setTitle("Ma première fenêtre");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}