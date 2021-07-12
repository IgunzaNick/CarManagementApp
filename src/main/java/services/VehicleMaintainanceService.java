package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleMaintenance;
import repositories.VehicleMaintainancerepository;

@Service

public class VehicleMaintainanceService {
@Autowired
	
	private VehicleMaintainancerepository repository;
	//return list of states
	public List<VehicleMaintenance> getVehicleMaintainance(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleMaintenance country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<VehicleMaintenance> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
