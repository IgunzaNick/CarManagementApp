package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Vehicle;

import repositories.Vehiclerepository;

@Service

public class VehicleService {
@Autowired
	
	private Vehiclerepository repository;
	//return list of states
	public List<Vehicle> getVehicleService(){
		return repository.findAll();
	}
	//save new state
	public void save(Vehicle country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Vehicle> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
