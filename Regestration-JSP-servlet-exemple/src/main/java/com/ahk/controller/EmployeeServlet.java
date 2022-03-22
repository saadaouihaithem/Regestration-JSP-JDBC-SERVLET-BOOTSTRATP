package com.ahk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ahk.DAO.EmployeeDAO;
import com.ahk.model.Employee;



@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private EmployeeDAO employeedao=new EmployeeDAO();
       
  
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("employeRegestration.jsp");
		 dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		Employee employee=new Employee();
		employee.setFirst_name(firstName);
		employee.setLast_name(lastName);
		employee.setUsername(userName);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
			employeedao.registrationEmployee(employee);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("employeDetails.jsp");
		 dispatcher.forward(request, response);
	}

}
