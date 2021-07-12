package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Contact;
import model.Country;
@Repository

public interface Contactrepository extends JpaRepository<Contact, Integer> {

}
