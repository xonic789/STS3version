package com.bit.sts04.model.entity;

import java.sql.Timestamp;

public class EmpVo {
	private int sabun;
	private String name;
	private Timestamp nalja;
	private int pay;
	private int deptno;
	
	
	public EmpVo() {
	}
	

	public int getSabun() {
		return sabun;
	}


	public void setSabun(int sabun) {
		this.sabun = sabun;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Timestamp getNalja() {
		return nalja;
	}


	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}


	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		result = prime * result + ((nalja == null) ? 0 : nalja.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pay;
		result = prime * result + sabun;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpVo other = (EmpVo) obj;
		if (deptno != other.deptno)
			return false;
		if (nalja == null) {
			if (other.nalja != null)
				return false;
		} else if (!nalja.equals(other.nalja))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pay != other.pay)
			return false;
		if (sabun != other.sabun)
			return false;
		return true;
	}


	public EmpVo(int sabun, String name, Timestamp nalja, int pay, int deptno) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.nalja = nalja;
		this.pay = pay;
		this.deptno = deptno;
	}


	@Override
	public String toString() {
		return "EmpVo [sabun=" + sabun + ", name=" + name + ", nalja=" + nalja + ", pay=" + pay + ", deptno=" + deptno
				+ "]";
	}

}
