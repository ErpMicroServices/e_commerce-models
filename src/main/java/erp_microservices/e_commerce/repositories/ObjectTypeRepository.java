package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.productdescriptions.ObjectType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ObjectTypeRepository extends CrudRepository<ObjectType, UUID> {
}
