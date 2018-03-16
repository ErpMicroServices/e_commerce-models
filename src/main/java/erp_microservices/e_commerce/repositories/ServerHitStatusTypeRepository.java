package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.ServerHitStatusType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ServerHitStatusTypeRepository extends CrudRepository<ServerHitStatusType, UUID> {
}
