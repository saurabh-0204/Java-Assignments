package connection_Steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionStatement {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/know_it";
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println("Database Connect");
			// using Statement showing data
			Statement statement = connection.createStatement();
			/*
			 * ResultSet resultSet=statement.executeQuery("select * from emp");
			 * while(resultSet.next()) { System.out.print(resultSet.getInt(1)+" : ");
			 * System.out.print(resultSet.getString(2)+" : ");
			 * System.out.print(resultSet.getString(3)+" : ");
			 * System.out.print(resultSet.getDate(5)+" : ");
			 * System.out.print(resultSet.getInt(8)+" : "); System.err.println(); }
			 */

			// For DML
			int n = statement.executeUpdate("update  emp100 set comm=5000 where empno=33");
			System.out.println(n + " Record Updated");

		} catch (ClassNotFoundException e) {
			System.out.println(" Class not found error ");
		} catch (SQLException e) {
			System.out.println("Data Base not found error ");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
