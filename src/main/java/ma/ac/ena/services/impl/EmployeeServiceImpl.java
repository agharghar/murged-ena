package ma.ac.ena.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Service;

import ma.ac.ena.entities.Employee;
import ma.ac.ena.entities.User;
import ma.ac.ena.repositories.EmployeeRepository;
import ma.ac.ena.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository ; 
	
	
	@Override
	public List<Employee> getAllUsersExeptMe(String username) {
		Employee employee = employeeRepository.findByName(username) ;  
		List<Employee> employees =  employeeRepository.findAll() ; 
		employees.remove(employee);
		return employees;
	}
	
	
	
	
	

}
