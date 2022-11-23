package com.ty.springEmp.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springEmp.dto.Employee;


@Repository
public class EmployeeDao {
	
	@Autowired
	private EntityManager entityManager;
	
	public Employee saveEmployee(Employee employee)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		return employee;
	}
	
public Employee updateStudent(Employee employee) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();

		return employee;
	}
	
	public Employee findStudentID(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			return employee;
		} else {
			return null;
		}
	}
	
	public boolean deleteEmployee(int id) 
	{
		Employee employee = entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();

		return true;
	}
	
	public List<Employee> findStudent(){
		Query query=entityManager.createQuery("select e from Employee e");
		
		return query.getResultList();
		
	}
	
	
	
}
