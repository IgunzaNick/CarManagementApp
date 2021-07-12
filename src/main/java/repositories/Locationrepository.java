package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Location;
@Repository
public interface Locationrepository extends JpaRepository<Location, Integer> {

}
