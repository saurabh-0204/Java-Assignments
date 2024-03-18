package jdbc_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ass2 {
	public static void main(String[] args) {
		Connection connection = null;
		BufferedReader br = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			br = new BufferedReader(new InputStreamReader(System.in));
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/know_it", "root", "root");
			System.out.println("Eneter Minimum Salary");
			int minsal = Integer.parseInt(br.readLine());
			System.out.println("Eneter Maximum Salary");
			int maxsal = Integer.parseInt(br.readLine());
			preparedStatement = connection.prepareStatement("select * from emp where sal between ? and ?");
			preparedStatement.setInt(1, minsal);
			preparedStatement.setInt(2, maxsal);

			ResultSet rsResultSet = preparedStatement.executeQuery();
			while (rsResultSet.next()) {
				System.out.print(rsResultSet.getInt(1) + " : ");
				System.out.print(rsResultSet.getString(2) + " : ");
				System.out.print(rsResultSet.getString(3) + " : ");
				System.out.print(rsResultSet.getInt(4) + " : ");
				System.out.print(rsResultSet.getDate(5) + " : ");
				System.out.print(rsResultSet.getFloat(6) + " : ");
				System.out.print(rsResultSet.getString(7) + " : ");
				System.out.print(rsResultSet.getInt(8));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception ");
		} catch (SQLException e) {
			System.out.println("SQL Exception while Connection");
		} catch (IOException e) {
			System.out.println("IO Exception While accepting the data");
		} finally {
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
