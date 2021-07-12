package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleMaintenance;
@Repository
public interface VehicleMaintainancerepository extends JpaRepository<VehicleMaintenance, Integer> {

}
