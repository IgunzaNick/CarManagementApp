package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Client;
import repositories.Clientrepository;

@Service

public class ClientService {
	@Autowired
	
	private Clientrepository repository;
	//return list of states
	public List<Client> getClient(){
		return repository.findAll();
	}
	//save new state
	public void save(Client country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Client> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
