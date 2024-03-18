package jdbc_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ass1 {

	public static void main(String[] args) {
		Connection connection = null;
		BufferedReader br = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/know_it";
			connection = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp where empno=?");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Number");
			int empno = Integer.parseInt(br.readLine());
			preparedStatement.setInt(1, empno);
			ResultSet rsResultSet = preparedStatement.executeQuery();

			if (rsResultSet == null) {
				System.out.println("Emp Not Found");

			} else {
				while (rsResultSet.next()) {
					System.out.print(rsResultSet.getInt(1) + " : ");
					System.out.print(rsResultSet.getString(2) + " : ");
					System.out.print(rsResultSet.getString(3) + " : ");
					System.out.print(rsResultSet.getInt(4) + " : ");
					System.out.print(rsResultSet.getDate(5) + " : ");
					System.out.print(rsResultSet.getFloat(6) + " : ");
					System.out.print(rsResultSet.getString(7) + " : ");
					System.out.print(rsResultSet.getInt(8));
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
		} catch (SQLException e) {
			System.out.println("SQL Exception Occured ");
		} catch (IOException e) {
			System.out.println("Exception At br.Read Line");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
