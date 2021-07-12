package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Employee;
@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer> {

}
