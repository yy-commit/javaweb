package com.neuedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.po.EmployeePO;

@Mapper
public interface EmployeeMapper {
	
	public List<EmployeePO> getEmployeeList();

}
