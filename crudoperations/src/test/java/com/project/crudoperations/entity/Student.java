package com.project.crudoperations.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String marks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(Integer id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
