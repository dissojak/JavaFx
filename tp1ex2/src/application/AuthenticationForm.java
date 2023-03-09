package application;

import javafx.application.Application;
import javafx.css.FontFace;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AuthenticationForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Authentication Form");

        // Create a grid pane for the labels and text fields
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add the labels and text fields to the grid
        Label welcomeLabel = new Label("Welcome!");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20)); // Set font weight to bold and use Arial font
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        grid.add(welcomeLabel, 0, 0, 2, 1); 
        grid.add(usernameLabel, 0, 1);
        grid.add(usernameField, 1, 1);
        grid.add(passwordLabel, 0, 2);
        grid.add(passwordField, 1, 2);

        // Create a horizontal box for the buttons
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        Button loginButton = new Button("Login");
        Button cancelButton = new Button("Cancel");
        buttonBox.getChildren().addAll(loginButton, cancelButton);

        // Create a vertical box for the entire form
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(grid, buttonBox);

        // Add an event handler to the login button
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (isValid(username, password)) {
                System.out.println("Authentication successful.");
            } else {
                System.out.println("Authentication failed.");
            }
        });

        // Add an event handler to the cancel button
        cancelButton.setOnAction(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });

        // Create the scene and add the vertical box to it
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private boolean isValid(String username, String password) {
        // Perform authentication logic here
        // This is just a sample implementation that accepts any username and password
        return true;
    }
}
