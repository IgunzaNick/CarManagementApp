package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleHire;
import repositories.VehicleHirerepository;

@Service

public class VehicleHireService {
@Autowired
	
	private VehicleHirerepository repository;
	//return list of states
	public List<VehicleHire> getvehiclehires(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleHire vehiclehires) {
		repository.save(vehiclehires);
		
		
	}
	//get state by id
	public Optional<VehicleHire> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
