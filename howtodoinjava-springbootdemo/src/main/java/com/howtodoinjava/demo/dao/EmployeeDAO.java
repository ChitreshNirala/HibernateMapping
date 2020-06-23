package com.howtodoinjava.demo.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Employee;
import com.howtodoinjava.demo.model.Employees;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();
	
	static {
		list.getEmployeeList().add(new Employee(1,"aa","a1","ch@gmail.com"));
		list.getEmployeeList().add(new Employee(2,"ab","a2","ch@gmail.com"));
		list.getEmployeeList().add(new Employee(3,"ac","a3","ch@gmail.com"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmployees( Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
