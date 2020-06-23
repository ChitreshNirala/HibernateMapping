package com.seleniumexpress.di;

public class Student {
	private int id;
	private String studentName;
	
	
	
	//cunstructor injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}




	/*
	 * //setter injection provided value from bean file as property(name
	 * =studentName ,value="") tag public void setId(int id) { this.id = id; }
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */



	public void displayStudentInfo() {
		System.out.println("student name is :" +studentName+ "and id is :" + id);
	}

}
