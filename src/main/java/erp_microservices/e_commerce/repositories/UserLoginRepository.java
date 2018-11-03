package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.login.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, UUID> {


	Optional<UserLogin> findByUserId(String userId);
}
