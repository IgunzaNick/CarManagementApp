package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.VehicleMake;
@Repository
public interface VehicleMakerepository extends JpaRepository<VehicleMake, Integer> {

}
