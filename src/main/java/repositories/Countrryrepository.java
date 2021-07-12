package repositories;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import model.Country;
@Component
@Repository

public interface Countrryrepository extends JpaRepository<Country, Integer> {
	

}
