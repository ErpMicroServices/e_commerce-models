package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.subscription.SubscriptionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, UUID> {
}
