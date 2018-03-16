package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.BrowserType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BrowserTypeRepository extends CrudRepository<BrowserType, UUID> {
}
