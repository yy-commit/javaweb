package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.po.EmployeePO;
import com.neuedu.service.EmployeeService;

@RestController
public class EmployeeHandler {
	
	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/emp/list")
	public List<EmployeePO> getEmployeeList(){
		return es.getEmployeeList();
	}

}
