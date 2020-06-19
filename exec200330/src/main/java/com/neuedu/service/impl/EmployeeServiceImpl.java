package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.EmployeeMapper;
import com.neuedu.po.EmployeePO;
import com.neuedu.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper mapper;

	@Override
	public List<EmployeePO> getEmployeeList() {
		// TODO Auto-generated method stub
		return mapper.getEmployeeList();
	}

}
