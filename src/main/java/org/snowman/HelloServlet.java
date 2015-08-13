package org.snowman;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		response.setContentType("text/html; charset=UTF-8");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<h1>薛宇的主页</h1>");
		response.getWriter().println("<p>欢迎来到薛宇的个人主页</p>");
		response.getWriter().println("session="+request.getSession(true).getId());
	}
}
