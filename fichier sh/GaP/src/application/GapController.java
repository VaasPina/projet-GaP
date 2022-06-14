package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GapController {
    @FXML
    private Button Create;

    @FXML
    private TextField Name;

    @FXML
    private TextField NewName;

    @FXML
    private Button Valid;

    @FXML
    void Clicked(ActionEvent event) {
    	Bdd car = new Bdd();
    	//Client Name = new Client (null, Name.getText());
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.131.60:3306/Client", "root", "ubuntu" );
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select * from ClientPk");
			ResultSetMetaData rsmd = rs.getMetaData();
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        primaryStage.setScene(Luffy);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void Creation(ActionEvent event) {
    	Bdd newCar = new Bdd();
    	Client NewClient = new Client (null, NewName.getText());
    	newCar.addClient(NewClient);
    	Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setScene(Luffy);

    }
private Scene Luffy;
	public void setsceneid(Scene sceneLuffy) {
		// TODO Auto-generated method stub
		Luffy = sceneLuffy;
	}
}
