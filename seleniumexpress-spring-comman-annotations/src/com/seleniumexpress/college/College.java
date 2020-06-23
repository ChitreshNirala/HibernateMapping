package com.seleniumexpress.college;


public class College {

	private Principal principal;
	
	private Teacher teacher;
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	//setter Injection
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	/*
	//constructor injection
	public College(Principal principal) {
		this.principal = principal;
	}
*/
	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("This is college class test Method");
	}
	
}
