package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/know_it";
		Connection connection=DriverManager.getConnection(url,"root","root");
		System.out.println("Conection Done");
		connection.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
      
		
	}

}
