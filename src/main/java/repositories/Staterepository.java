package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.State;
@Repository
public interface Staterepository extends JpaRepository<State, Integer> {

}
