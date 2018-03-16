package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webcontent.WebContentType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WebContentTypeRepository extends CrudRepository<WebContentType, UUID> {
}
