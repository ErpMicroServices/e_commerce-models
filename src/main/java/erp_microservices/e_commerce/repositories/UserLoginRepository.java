package erp_microservices.e_commerce.repositories;

import erp_microservices.e_commerce.models.login.UserLogin;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserLoginRepository extends CrudRepository<UserLogin, UUID> {
}
