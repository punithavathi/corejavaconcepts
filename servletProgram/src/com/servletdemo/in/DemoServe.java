package com.servletdemo.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyOwnServlet",
        description = "This is my first annotated servlet",
        urlPatterns = "/processServlet"
        )
public class DemoServe extends HttpServlet {
	//private static final long serialVersionUID = 1L;
    
    public DemoServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<html><body>");
pw.println("Welcome to servelt");
pw.println("</html></body>");
	}

	
}
