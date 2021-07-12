package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Supplier;
@Repository
public interface Supplierrepository extends JpaRepository<Supplier, Integer> {

}
