package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleMovement;
@Repository
public interface VehicleMovementrepository extends JpaRepository<VehicleMovement, Integer> {

}
