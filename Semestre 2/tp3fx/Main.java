package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
@Override
public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("AddBook.fxml"));
		primaryStage.setTitle("ADD BOOK");
		primaryStage.setScene(new Scene(root, 410, 500));
	    primaryStage.setMaxWidth(410);
	    primaryStage.setMaxHeight(500);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
