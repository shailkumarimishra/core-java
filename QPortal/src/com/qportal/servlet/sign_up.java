package com.qportal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qportal.dao.impl.RegistrationDAOImpl;
import com.qportal.domain.RegistrationDomain;
import com.qportal.model.Registration;

/**
 * Servlet implementation class sign_up
 */
@WebServlet("/sign_up.do")
public class sign_up extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public sign_up() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RegistrationDomain reg=new RegistrationDomain();
//	1.collecting data
	reg.setUsername(request.getParameter("username"));
	reg.setEmail(request.getParameter("email"));
	reg.setPassword(request.getParameter("password"));
	reg.setConfirm_password(request.getParameter("confirm_password"));
//	verifying the data
	RegistrationDAOImpl dao = new RegistrationDAOImpl();
	
	boolean success = dao.save(reg);
	List<RegistrationDomain> list = dao.findAll();
	StringBuilder sb =new StringBuilder();
	if (success) {
	String	msg = "<h1>Registration completed successfully</h1>";
		sb.append(msg).append("<p>").append(list.get(0).getUsername()).append("</p>").append("<br>").append("<a href='quizchoice.html'>")
		.append("Click here to continue for Quiz").append("</a>");
		}
	else {
		String msg = "<h1>Registration failed</h1>";
		sb.append(msg);
		}

	// 3.prepare the response

	PrintWriter out = response.getWriter();
	out.write(sb.toString());
	out.flush();
	out.close();



	
	}
}
