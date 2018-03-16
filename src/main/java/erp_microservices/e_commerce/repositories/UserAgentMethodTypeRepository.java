package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.UserAgentMethodType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserAgentMethodTypeRepository extends CrudRepository<UserAgentMethodType, UUID> {
}
