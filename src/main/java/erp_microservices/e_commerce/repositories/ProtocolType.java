package erp_microservices.e_commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProtocolType extends JpaRepository<ProtocolType, UUID> {
}
