package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VisitRepository extends JpaRepository<Visit, UUID> {

	Visit findByCookie(String cookie);
}
