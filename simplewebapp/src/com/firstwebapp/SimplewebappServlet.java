package com.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SimplewebappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");
	}
}
