package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.User;
@Repository
public interface Userrepository extends JpaRepository<User, Integer> {
	
	User findByusername(String username);

}
