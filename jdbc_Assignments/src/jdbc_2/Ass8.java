package jdbc_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Ass8 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/know_it";
			connection = DriverManager.getConnection(url, "root", "root");

			stmt = connection.createStatement();
		 rs=stmt.executeQuery("select * from emp");
		 
		 //ResultSetMetaData rsmd=rs.getMetaData();
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
		} finally {
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
