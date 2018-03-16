package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.productdescriptions.NeedType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NeedTypeRepository extends CrudRepository<NeedType, UUID> {
}
