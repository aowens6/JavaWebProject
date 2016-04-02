package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		
		out.append("<!DOCTYPE html>\n<html>\n<head>\n\t<title>AJ Owens | Home</title>");
		out.append("\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/styles.css\"");
		out.append("\n</head>\n<body>");
		out.append("\n<div id = \"wrapper\">");
		out.append("\n\t<h1>AJ Owens</h1>");
		out.append("\n\t<nav>");
		out.append("\n\t\t<ul>");
		out.append("\n\t<li><a href=\"./Home\">Home</a></li>");
		out.append("\n\t<li><a href=\"./About\">About</a></li>");
		out.append("\n\t<li><a href=\"./Contact\">Contact</a></li>");
		out.append("\n\t\t</ul>");
		out.append("\n\t</nav>");
		out.append("\n\t<div class=\"content\">");
		out.append("\n\t\t<p>Hello world, and welcome to my personal site.</p>");
		out.append("\n\t\t<p>In this site you will find information about me, what I like, my hobbies, and my future plans.</p>");
		out.append("\n\t\t<p>Please use the navigation links above to find your way to the About Me section, my Contact information, and your way back to the Home page.</p>");
		out.append("\n\t\t<p>Coming soon: Web Projects!</p>");
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