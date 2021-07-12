package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.State;
import repositories.Staterepository;

@Service

public class StateService {
	@Autowired
	
	private Staterepository repository;
	//return list of states
	public List<State> getState(){
		return repository.findAll();
	}
	//save new state
	public void save(State country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<State> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
