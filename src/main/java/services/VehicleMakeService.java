package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleMake;
import repositories.VehicleMakerepository;

@Service

public class VehicleMakeService {
@Autowired
	
	private VehicleMakerepository repository;
	//return list of states
	public List<VehicleMake> getvehiclemake(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleMake location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<VehicleMake> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
