package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
@Repository
public interface Clientrepository extends JpaRepository<Client, Integer> {

}
