package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleModel;
@Repository
public interface VehicleModelrepository extends JpaRepository<VehicleModel, Integer> {

}
