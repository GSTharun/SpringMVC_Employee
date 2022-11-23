package com.ty.springEmp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springEmp.dao.EmployeeDao;
import com.ty.springEmp.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public Employee saveEmployee(Employee employee)
	{
		dao.saveEmployee(employee);
		return employee;
	}

}
