package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webcontent.WebContentRoleType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WebContentRoleTypeRepository extends CrudRepository<WebContentRoleType, UUID> {
}
