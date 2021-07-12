package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.VehicleMovement;
import repositories.VehicleMovementrepository;

@Service

public class VehicleMovementService {
	@Autowired
	
	private VehicleMovementrepository repository;
	//return list of states
	public List<VehicleMovement> getMovement(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleMovement country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<VehicleMovement> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
