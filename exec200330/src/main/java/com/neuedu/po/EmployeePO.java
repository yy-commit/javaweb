package com.neuedu.po;

import java.sql.Date;

public class EmployeePO {
	
	private Integer empid;
	private String ename;
	private Date hiredate;
	private DeptPO dept;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public DeptPO getDept() {
		return dept;
	}
	public void setDept(DeptPO dept) {
		this.dept = dept;
	}
}
