package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/Contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final PrintWriter out = response.getWriter();
		
		out.append("<!DOCTYPE html>\n<html>\n<head>\n\t<title>AJ Owens | Contact</title>");
		out.append("\n\t<link rel=\"stylesheet\" type='text/css' href='./css/styles.css'");
		out.append("\n</head>\n<body>");
		out.append("\n<div id = \"wrapper\">");
		out.append("\n\t<h1>Contact AJ Owens</h1>");
		out.append("\n\t<nav>");
		out.append("\n\t\t<ul>");
		out.append("\n\t<li><a href=\"./Home\">Home</a></li>");
		out.append("\n\t<li><a href=\"./About\">About</a></li>");
		out.append("\n\t<li><a href=\"./Contact\">Contact</a></li>");
		out.append("\n\t\t</ul>");
		out.append("\n\t</nav>");
		out.append("\n\t<div class=\"content\">");
		out.append("\n\t\t<p>Email: aowens@gmail.com</p>");
		out.append("\n\t\t<p>Phone: 555-555-5555</p>");
		out.append("\n\t\t<p>GitHub:<a href=\"www.github.com/aowens6\">aowens6</a></p>");
		out.append("\n\t\t<form action=\"#\">First name:<br><input type=\"text\" name=\"firstname\"><br>"
				+ "Last name:<br><input type=\"text\" name=\"lastname\"><br><br>"
				+ "Email:<br><input type=\"text\" name=\"email\"><br><br>"
				+ "<input type=\"submit\" value=\"Submit\">"
				+ "</form>");
		out.append("\n</div>");
		out.append("\n<p>&copy; Copyright AJ Owens 2016</p>");
		out.append("\n</div>");
		out.append("\n</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
