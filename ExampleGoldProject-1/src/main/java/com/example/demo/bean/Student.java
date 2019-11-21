package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_STUDENT_SPRING")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator ="STU_SEQ")
	@SequenceGenerator(sequenceName ="SPRING_SEQ",allocationSize=1,name="STU")
 private int id;
 private String name;
 private String pass;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
 
}
