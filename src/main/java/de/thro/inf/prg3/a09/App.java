/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.thro.inf.prg3.a09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Peter Kurfer
 * <p>
 * Note: This program can't be started from IntelliJ, use `./gradlew run` in the terminal.
 */
public class App extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// note: var is the dynamic type; specify template argument b/c compiler can't infer it!
		Parent root = FXMLLoader.load(getClass().getResource("views/main.fxml"));
		primaryStage.setTitle("Fleet management");
		primaryStage.setScene(new Scene(root, 800, 600));
		primaryStage.show();
	}
}
