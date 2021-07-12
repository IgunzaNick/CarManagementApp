package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Contact;
import repositories.Contactrepository;

@Service

public class ContactService {
	@Autowired
	
	private Contactrepository repository;
	//return list of states
	public List<Contact> getContact(){
		return repository.findAll();
	}
	//save new state
	public void save(Contact country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Contact> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
