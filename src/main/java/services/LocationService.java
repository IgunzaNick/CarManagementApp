package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Location;
import repositories.Locationrepository;


@Service

public class LocationService {
	@Autowired
	
	private Locationrepository repository;
	//return list of states
	public List<Location> getlocation(){
		return repository.findAll();
	}
	//save new state
	public void save(Location location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<Location> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}


}
