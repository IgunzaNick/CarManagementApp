package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleType;
@Repository
public interface VehicleTyperepository extends JpaRepository<VehicleType, Integer> {

}
