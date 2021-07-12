package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.EmployeeType;
import repositories.EmployeeTyperepository;

@Service

public class EmployeeTypeService {
@Autowired
	
	private EmployeeTyperepository repository;
	//return list of states
	public List<EmployeeType> getemployeetypee(){
		return repository.findAll();
	}
	//save new state
	public void save(EmployeeType location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<EmployeeType> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
