package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Bdd {
	public Boolean addClient(Client client) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  conn = DriverManager.getConnection("jdbc:mysql://192.168.131.60:3306/Client", "root", "ubuntu");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO ClientPk VALUES(NULL, ?)");
            ps.setString(1,client.getName());
            ps.executeUpdate();
            return true;
        } catch (Exception e) { e.printStackTrace(); }
        return false;
    }

}
