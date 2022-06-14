package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			FXMLLoader rootLuffy = new FXMLLoader(getClass().getResource("Luffy.fxml"));
			Parent fenetreLuffy=rootLuffy.load();
			Scene sceneLuffy = new Scene(fenetreLuffy);
			sceneLuffy.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			LuffyController moncontroleur = (LuffyController) rootLuffy.getController();
		

			FXMLLoader rootlogin = new FXMLLoader(getClass().getResource("Gap.fxml"));
			Parent fenetrelogin=rootlogin.load();
			Scene sceneGap = new Scene(fenetrelogin);
			GapController gapcontroller = (GapController) rootlogin.getController();
			gapcontroller.setsceneid(sceneLuffy);
			moncontroleur.setsceneid(sceneGap);

			
			primaryStage.setScene(sceneGap);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
