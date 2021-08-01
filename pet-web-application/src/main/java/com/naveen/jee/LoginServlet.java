package com.naveen.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns ="/servlet.login")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LoginService service = new LoginService();
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").
							forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if (service.isValidUser(name, password)) {
			request.setAttribute("name", name);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").
			forward(request, response);
		} else {
			request.setAttribute("errorMsg","Invalide Credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").
			forward(request, response);
		}
	}
	  
}
