package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Invoice;
import repositories.Invoicerepository;

@Service

public class InvoiceService {
	@Autowired
	
	private Invoicerepository repository;
	//return list of states
	public List<Invoice> getInvoice(){
		return repository.findAll();
	}
	//save new state
	public void save(Invoice country) {
		repository.save(country);
		
		
	}
	//get state by id
	public Optional<Invoice> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
	

}
