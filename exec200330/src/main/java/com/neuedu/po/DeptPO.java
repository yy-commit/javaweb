package com.neuedu.po;

import java.util.List;

public class DeptPO {
	
	private Integer deptid;
	private String dname;
	private List<EmployeePO> emplist;
	
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<EmployeePO> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<EmployeePO> emplist) {
		this.emplist = emplist;
	}

}
