package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleModel;
import repositories.VehicleModelrepository;

@Service

public class VehicleModelService {
@Autowired
	
	private VehicleModelrepository repository;
	//return list of states
	public List<VehicleModel> getvehiclemodel(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleModel location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<VehicleModel> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
