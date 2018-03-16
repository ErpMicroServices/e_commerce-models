package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.PlatformType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PlatformTypeRepository extends CrudRepository<PlatformType, UUID> {
}
