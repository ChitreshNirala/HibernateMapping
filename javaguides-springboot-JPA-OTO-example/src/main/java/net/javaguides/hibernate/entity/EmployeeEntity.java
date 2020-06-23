package net.javaguides.hibernate.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable
{
   private static final long serialVersionUID = -1798070786993154676L;
   @Id
   @Column(name = "ID", unique = true, nullable = false)
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer           employeeId;
   @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
   private String            firstName;
   @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
   private String            lastName;
 
   //We will define the association here
   AccountEntity             account;

   
   
public EmployeeEntity() {
}

public EmployeeEntity(String firstName, String lastName, AccountEntity account) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.account = account;
}



public EmployeeEntity(Integer employeeId, String firstName, String lastName, AccountEntity account) {
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.account = account;
}



public Integer getEmployeeId() {
	return employeeId;
}



public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public AccountEntity getAccount() {
	return account;
}



public void setAccount(AccountEntity account) {
	this.account = account;
}



@Override
public String toString() {
	return "EmployeeEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", account=" + account + "]";
}


 
   
   
}