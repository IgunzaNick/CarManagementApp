package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Vehicle;
@Repository
public interface Vehiclerepository extends JpaRepository<Vehicle, Integer> {

}
