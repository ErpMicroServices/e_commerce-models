package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.subscription.Subscription;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SubscriptionRepository extends CrudRepository<Subscription, UUID> {
}
