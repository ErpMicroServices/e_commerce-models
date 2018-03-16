package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.Visit;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VisitRepository extends CrudRepository<Visit, UUID> {

	Visit findByCookie(String cookie);
}
