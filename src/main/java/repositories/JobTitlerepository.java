package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.JobTitle;
@Repository
public interface JobTitlerepository extends JpaRepository<JobTitle, Integer> {

}
