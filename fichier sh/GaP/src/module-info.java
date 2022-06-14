module GaP {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mysql.connector.java;
	requires org.eclipse.paho.client.mqttv3;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
