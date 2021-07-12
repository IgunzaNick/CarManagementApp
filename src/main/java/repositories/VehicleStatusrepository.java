package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleStatus;
@Repository
public interface VehicleStatusrepository extends JpaRepository<VehicleStatus, Integer> {

}
