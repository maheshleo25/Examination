package com.studentManage;

public class Student {
	private int rollno;
	private String studentName;
	private int marks;
	private int phoneNo; 
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Student(int rollno, String studentName, int marks, int phoneNo) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.marks = marks;
		this.phoneNo = phoneNo;
	}
	public Student(String studentName, int marks, int phoneNo) {
		super();
		this.studentName = studentName;
		this.marks = marks;
		this.phoneNo = phoneNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", marks=" + marks + ", phoneNo="
				+ phoneNo + "]";
	}
	
 	
}

