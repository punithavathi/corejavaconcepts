package com.login.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		pw.println("Welcome " +name);
		pw.close();
		
		
	}
}
