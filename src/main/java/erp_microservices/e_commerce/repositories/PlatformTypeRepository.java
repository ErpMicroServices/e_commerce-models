package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webvisit.PlatformType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlatformTypeRepository extends JpaRepository<PlatformType, UUID> {
}
