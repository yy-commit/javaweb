package com.neuedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.po.DeptPO;

@Mapper
public interface DeptMapper {

	public List<DeptPO> getDeptList();
	public DeptPO getDeptById(Integer deptid);
}
