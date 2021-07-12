package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.VehicleStatus;
import repositories.VehicleStatusrepository;

@Service

public class VehicleStatusService {
@Autowired
	
	private VehicleStatusrepository repository;
	//return list of states
	public List<VehicleStatus> getvehiclestatus(){
		return repository.findAll();
	}
	//save new state
	public void save(VehicleStatus location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<VehicleStatus> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
