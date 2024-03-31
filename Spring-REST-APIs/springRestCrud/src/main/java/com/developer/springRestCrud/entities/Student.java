package com.developer.springRestCrud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String studentnm;
	private String rollno;
	private String education;
	private String gender;
	private float feespaid;
	private float feesunpaid;
	private String phone;
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentnm() {
		return studentnm;
	}
	public void setStudentnm(String studentnm) {
		this.studentnm = studentnm;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(float feespaid) {
		this.feespaid = feespaid;
	}
	public float getFeesunpaid() {
		return feesunpaid;
	}
	public void setFeesunpaid(float feesunpaid) {
		this.feesunpaid = feesunpaid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentnm=" + studentnm + ", rollno=" + rollno + ", education="
				+ education + ", gender=" + gender + ", feespaid=" + feespaid + ", feesunpaid=" + feesunpaid
				+ ", phone=" + phone + "]";
	}
	
	

}
