package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.EmployeeType;
@Repository
public interface EmployeeTyperepository extends JpaRepository<EmployeeType, Integer> {

}
