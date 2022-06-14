package application;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class LuffyController {
	@FXML
	private Pane Pane1;
	@FXML
	private Pane Pane2;
	@FXML
	void statuChange(MouseEvent event) {
		/**String Pane2 = "abcdef";
		yournode.setStyle("-fx-background-color: red" + Pane2);*/

	    }

	@FXML
	 void statusChange(MouseEvent event) {
		/*String Pane1 = "abcdef";
		yournode.setStyle("-fx-background-color: red" + Pane1);*/
		/*String publisherId = UUID.randomUUID().toString();
		IMqttClient publisher = new MqttClient("tcp://192.168.131.60:1883",publisherId);
		MqttConnectOptions options = new MqttConnectOptions();
		options.setAutomaticReconnect(true);
		options.setCleanSession(true);
		options.setConnectionTimeout(10);
		publisher.connect(options);
		CountDownLatch receivedSignal = new CountDownLatch(10);
		subscriber.subscribe(EngineTemperatureSensor.TOPIC, (topic, msg) -> {
		    byte[] payload = msg.getPayload();
		    // ... payload handling omitted
		    receivedSignal.countDown();
		});    
		receivedSignal.await(1, TimeUnit.MINUTES);*/

	    }
	
	private Scene Gap;
	public void setsceneid(Scene sceneGap) {
		// TODO Auto-generated method stub
		Gap = sceneGap;
	}
	
	
	/*String publisherId = UUID.randomUUID().toString();
	IMqttClient publisher = new MqttClient("tcp://192.168.131.60:1883",publisherId);
	MqttConnectOptions options = new MqttConnectOptions();
	options.setAutomaticReconnect(true);
	options.setCleanSession(true);
	options.setConnectionTimeout(10);
	publisher.connect(options);
	CountDownLatch receivedSignal = new CountDownLatch(10);
	subscriber.subscribe(EngineTemperatureSensor.TOPIC, (topic, msg) -> {
	    byte[] payload = msg.getPayload();
	    // ... payload handling omitted
	    receivedSignal.countDown();
	});    
	receivedSignal.await(1, TimeUnit.MINUTES);*/

}
