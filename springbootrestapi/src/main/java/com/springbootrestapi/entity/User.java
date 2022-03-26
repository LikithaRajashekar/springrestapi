package com.springbootrestapi.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" user_user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "fullName")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private Integer age;
	
	public User(){
		
	}
	
	
	public User(String name, String gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + " ]";
	}
	

}
