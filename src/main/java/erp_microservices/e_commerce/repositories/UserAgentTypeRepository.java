package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.UserAgentType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserAgentTypeRepository extends CrudRepository<UserAgentType, UUID> {
}
