package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleType;
import repositories.VehicleTyperepository;

@Service

public class VehicleTypeService {
@Autowired
	
	private VehicleTyperepository repository;
	//return list of states
	public List<VehicleType> getvehicletype(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleType location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<VehicleType> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
