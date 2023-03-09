module TP2 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens exemple to javafx.graphics, javafx.fxml;
}
