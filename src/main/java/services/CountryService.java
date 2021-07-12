package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import model.Country;
import repositories.Countrryrepository;



@Service


public class CountryService {
	
	
	
	@Autowired
	
	private Countrryrepository repository;
	//return list of countries
	public List<Country> getCountries(){
		return repository.findAll();
	}
	//save new country
	public void save(Country country) {
		repository.save(country);
		
		
	}
	//get country by id
	public Optional<Country> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
