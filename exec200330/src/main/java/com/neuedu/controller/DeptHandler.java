package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.po.DeptPO;
import com.neuedu.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptHandler {
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping("/list")
	public List<DeptPO> getDeptList(){
		return ds.getDeptList();
	}

	@RequestMapping("/detail/{deptid}")	
	public DeptPO getDeptInfo(@PathVariable Integer deptid) {
		return ds.getDeptById(deptid);
	}
}
