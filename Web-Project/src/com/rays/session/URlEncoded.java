package com.rays.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/URlEncoded")
public class URlEncoded extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("username", "Hritesh");

		// normal URL
		String url = "WelcomeCtl";

		// encode URL
		String encodedURL = response.encodeURL(url);

		// print or send in response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='" + encodedURL + "'>Go to WelcomeCtl</a>");
	}

}
