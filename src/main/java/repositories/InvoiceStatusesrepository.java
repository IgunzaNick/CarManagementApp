package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Client;
import model.InvoiceStatuses;
@Repository
public interface InvoiceStatusesrepository extends JpaRepository<InvoiceStatuses, Integer> {

}
