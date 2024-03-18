package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ShoppingAppListener implements ServletContextListener {
	Connection con;

	public void contextDestroyed(ServletContextEvent sce) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void contextInitialized(ServletContextEvent sce) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shoppingdb";
			con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Established");

			sce.getServletContext().setAttribute("jdbccon", con);
        	System.out.println("con set as context level attribute");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
