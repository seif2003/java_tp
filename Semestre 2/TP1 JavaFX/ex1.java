package application;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
@Override
public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Ma première fenêtre");
		primaryStage.setScene(scene);
		primaryStage.show();
		ObservableList<Node> liste = root.getChildren();
		liste.add(new Rectangle(100, 100, 50, 50));
		liste.add(new Line(50, 50, 100, 100));
		liste.add(new Circle(7, 7, 50));
	}

	public static void main(String[] args) {
		launch(args);
	}
}