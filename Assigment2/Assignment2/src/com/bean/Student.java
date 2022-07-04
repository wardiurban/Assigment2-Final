package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_prj")
public class Student {
	@Id
	private int stid;
	private String stname;
	private int stcid;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getStcid() {
		return stcid;
	}
	public void setStcid(int stcid) {
		this.stcid = stcid;
	}

}
