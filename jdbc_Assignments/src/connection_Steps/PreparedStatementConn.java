package connection_Steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementConn {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/know_it";
			conn = DriverManager.getConnection(url, "root", "root");
			String query = "select * from emp where empno=?";

			PreparedStatement ps = conn.prepareStatement(query);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter dept no :");
			int dno = Integer.parseInt(br.readLine());
			ps.setInt(1, dno);

			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				//iteration for one record
				System.out.print(rs.getInt(1)+" : ");
				System.out.print(rs.getString(2)+" : ");
				System.out.print(rs.getDate(5)+" : ");
				System.out.print(rs.getFloat(6));
				System.out.println();				
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.getMessage();
		} catch (IOException e) {
			// TODO: handle exception
		}

		finally {
			try {
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
