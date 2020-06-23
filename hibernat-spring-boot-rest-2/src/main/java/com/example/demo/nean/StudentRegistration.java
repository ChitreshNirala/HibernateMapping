package com.example.demo.nean;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	private static StudentRegistration stdtregd = null;
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	
	
	public static StudentRegistration getInstance() {
		
		if (stdtregd == null) {
			stdtregd= new StudentRegistration();
			return stdtregd;
		} else {
			return stdtregd;
		}
		
	}

	public void add(Student std) {
		studentRecords.add(std);
		
	}
	
	public String updateStudent(Student std) {
		
		for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
              studentRecords.set(i, std);//update the new record
              return "Update successful";
            }
        }
		return "Update un-successful";
	}
	
	
	public String deleteStudent(String registrationNumber) {
		for(int i=0; i<studentRecords.size(); i++)
		        {
		            Student stdn = studentRecords.get(i);
		            if(stdn.getRegistrationNumber().equals(registrationNumber)){
		              studentRecords.remove(i);//update the new record
		              return "Delete successful";
		            }
		        }
		return "Delete un-successful";
		}
		    public List<Student> getStudentRecords() {
		    return studentRecords;
		    }
	
}
