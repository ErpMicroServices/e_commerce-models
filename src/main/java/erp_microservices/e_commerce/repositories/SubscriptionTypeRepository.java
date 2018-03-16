package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.subscription.SubscriptionType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SubscriptionTypeRepository extends CrudRepository<SubscriptionType, UUID> {
}
