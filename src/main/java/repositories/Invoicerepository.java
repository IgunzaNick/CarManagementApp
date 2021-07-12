package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.Invoice;
@Repository
public interface Invoicerepository extends JpaRepository<Invoice, Integer> {

}
