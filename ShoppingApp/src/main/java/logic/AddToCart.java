package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("product"));
		List<Integer> list = null;
		HttpSession session = request.getSession();
		list = (List) session.getAttribute("cart");
		if (list == null) {
			list = new ArrayList<Integer>();
		}
		list.add(id);
		session.setAttribute("cart", list);

		PrintWriter out = response.getWriter();
		out.print("Pid " + id + " is added in the cart <br/>");
		out.print("<br/> <a href='home'> Go back for selection </a>");
//		out.print("<br/> <a href='viewcart'> View cart </a>");
	out.print("<br/> <a href='ViewCart.jsp'> View cart </a>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
