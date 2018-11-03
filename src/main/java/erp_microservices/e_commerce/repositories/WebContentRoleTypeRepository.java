package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.webcontent.WebContentRoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WebContentRoleTypeRepository extends JpaRepository<WebContentRoleType, UUID> {
}
