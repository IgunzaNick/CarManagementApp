package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleHire;
@Repository
public interface VehicleHirerepository extends JpaRepository<VehicleHire, Integer> {

}
