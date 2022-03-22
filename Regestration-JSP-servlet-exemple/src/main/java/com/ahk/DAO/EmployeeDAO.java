package com.ahk.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ahk.model.Employee;

public class EmployeeDAO {
public int registrationEmployee(Employee employee)throws ClassNotFoundException{
	
	String INSERT_USER_SQL="INSERT INTO employee "+"(id,first_name,last_name,username,password,address,contact)VALUES"+"(?,?,?,?,?,?,?);";
	int result=0;
	Class.forName("com.mysql.jdbc.cj.Driver");
	
	try (Connection connection=DriverManager
			.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false","","");
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL)){
		
		preparedStatement.setInt(1, 1);
		
		preparedStatement.setString(2, employee.getFirst_name());
		preparedStatement.setString(3, employee.getLast_name());
		preparedStatement.setString(4, employee.getUsername());
		preparedStatement.setString(4, employee.getPassword());
		preparedStatement.setString(6,employee.getAddress());
		preparedStatement.setString(7, employee.getContact());
		System.out.println(preparedStatement);
		// Second stepnew we will try to excute the query update
		result=preparedStatement.executeUpdate();
		
		
	}catch(SQLException e) {
		
		e.printStackTrace();
		
	}
	
	return result;
	
}
}
