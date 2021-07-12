package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Supplier;
import repositories.Supplierrepository;

@Service

public class SupplierService {
@Autowired
	
	private Supplierrepository repository;
	//return list of states
	public List<Supplier> getSupplier(){
		return repository.findAll();
	}
	//save new state
	public void save(Supplier country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Supplier> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}

}
