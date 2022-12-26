package com.jojuskills.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id @Column
	private int sno;
	@Column
	private String snmae;
	@Column
	private String course;
	
	public Student() {
		super();
		
	}

	public Student(int sno, String snmae, String course) {
		super();
		this.sno = sno;
		this.snmae = snmae;
		this.course = course;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSnmae() {
		return snmae;
	}

	public void setSnmae(String snmae) {
		this.snmae = snmae;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	
	


}
