package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.InvoiceStatuses;
import repositories.InvoiceStatusesrepository;

@Service

public class InvoiceStatusesService {
@Autowired
	
	private InvoiceStatusesrepository repository;
	//return list of states
	public List<InvoiceStatuses> getlocation(){
		return repository.findAll();
	}
	//save new state
	public void save(InvoiceStatuses location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<InvoiceStatuses> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
