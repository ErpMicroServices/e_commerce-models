package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.productdescriptions.DescriptionObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DescriptionObjectRepository extends JpaRepository<DescriptionObject, UUID> {
}
