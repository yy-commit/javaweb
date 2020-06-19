package com.neuedu.service;

import java.util.List;

import com.neuedu.po.DeptPO;

public interface DeptService {

	public List<DeptPO> getDeptList();
	public DeptPO getDeptById(Integer deptid);
}
