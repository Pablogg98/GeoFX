package dad.javafx.geofx;

import dad.javafx.geofx.ui.GeoController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoApp extends Application{

	private GeoController geoController;;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		geoController = new GeoController();
		
		Scene scene = new Scene(geoController.getView(),500,400);
		
		primaryStage.setTitle("GeoFx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
