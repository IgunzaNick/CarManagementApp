package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.JobTitle;
import repositories.JobTitlerepository;

@Service

public class JobtitleService {
@Autowired
	
	private JobTitlerepository repository;
	//return list of states
	public List<JobTitle> getjobtitle(){
		return repository.findAll();
	}
	//save new state
	public void save(JobTitle location) {
		repository.save(location);
		
		
	}
	//get state by id
	public Optional<JobTitle> findById(int id) {
		return repository.findById(id);
		
	}
	public void delete(Integer id) {
	repository.deleteById(id);
		
	}
}
