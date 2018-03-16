package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webcontent.FunctionType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FunctionTypeRepository extends CrudRepository<FunctionType, UUID> {
}
