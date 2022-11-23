package com.ty.springEmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.springEmp.dto.Employee;
import com.ty.springEmp.service.EmployeeService;

@Controller
public class EmployeeController

{
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}
	@RequestMapping("signup")
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}

	@RequestMapping("saveemployee")
	public ModelAndView saveemployee(@ModelAttribute Employee employee) {

		employeeService.saveEmployee(employee);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}

}
