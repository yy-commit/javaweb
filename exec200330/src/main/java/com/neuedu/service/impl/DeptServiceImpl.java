package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.DeptMapper;
import com.neuedu.po.DeptPO;
import com.neuedu.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper mapper;

	@Override
	public List<DeptPO> getDeptList() {
		// TODO Auto-generated method stub
		return mapper.getDeptList();
	}

	@Override
	public DeptPO getDeptById(Integer deptid) {
		// TODO Auto-generated method stub
		return mapper.getDeptById(deptid);
	}
}
