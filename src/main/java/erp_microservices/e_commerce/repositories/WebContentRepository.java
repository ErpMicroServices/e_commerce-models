package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webcontent.WebContent;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WebContentRepository extends CrudRepository<WebContent, UUID> {
}
