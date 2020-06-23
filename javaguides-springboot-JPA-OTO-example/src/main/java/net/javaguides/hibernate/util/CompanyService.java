package net.javaguides.hibernate.util;

import org.springframework.stereotype.Service;

import net.javaguides.hibernate.repository.AccountEntityRepository;
import net.javaguides.hibernate.repository.EmployeeEntityRepository;

@Service
public class CompanyService {

	private final AccountEntityRepository accountRepository;
	private final EmployeeEntityRepository employeeRepository;
	public CompanyService(AccountEntityRepository accountRepository, EmployeeEntityRepository employeeRepository) {
		this.accountRepository = accountRepository;
		this.employeeRepository = employeeRepository;
	}
	
	
	public void create() {
		// TODO Auto-generated method stub
		
	}
	public void read() {
		// TODO Auto-generated method stub
		
	}
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
