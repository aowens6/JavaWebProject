package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/About")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		final PrintWriter out = response.getWriter();
		
		out.append("<!DOCTYPE html>\n<html>\n<head>\n\t<title>AJ Owens | About</title>");
		out.append("\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/styles.css\">");
		out.append("\n</head>\n<body>");
		out.append("\n<div id = \"wrapper\">");
		out.append("\n\t<h1>About AJ Owens</h1>");
		out.append("\n\t<nav>");
		out.append("\n\t\t<ul>");
		out.append("\n\t<li><a href=\"./Home\">Home</a></li>");
		out.append("\n\t<li><a href=\"./About\">About</a></li>");
		out.append("\n\t<li><a href=\"./Contact\">Contact</a></li>");
		out.append("\n\t\t</ul>");
		out.append("\n\t</nav>");
		out.append("\n\t<div class=\"content\">");
		out.append("\n\t\t<h2>Welcome</h2>");
		out.append("\n\t\t<p>Greetings and thank you for visiting my site. My name is AJ, and I want to be a fantastic programmer.</p>");
		out.append("\n\t\t<p>I'm a small-town guy who bounced around to several places before deciding to become a programmer. For the last five summers, I lived in Wisconsin Dells, and between seasons I've resided in Orlando, Ohio, and even Costa Rica. Adventure is a necessity. The experiences I gained while postponing college were invaluable. They not only stimulated personal growth but I picked up a few skills along the way!</p>");
		out.append("\n\t\t<p>Some of my hobbies include learning foreign languages, reading sci-fi and fantasy novels, weight training, and of course learning about web development.</p>");
		out.append("\n\t\t<p>What I realized while attending Chippewa Valley Technical College for the Information Technology - Software Developer program is that coding is fascinating to me. My plan is to continue my education at the University of Wisconsin - Stout for my Bachelor's degree in Computer Science. I look forward to learning every day and my future as a software developer.</p>");
		out.append("\n\t</div>");
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
