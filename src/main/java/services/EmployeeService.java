package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Employee;
import repositories.Employeerepository;

@Service

public class EmployeeService {
@Autowired
	
	private Employeerepository repository;
	//return list of states
	public List<Employee> getemployeeService(){
		return repository.findAll();
	}
	//save new state
	public void save(Employee country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Employee> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
