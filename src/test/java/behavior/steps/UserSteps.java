package behavior.steps;

import erp_microservices.e_commerce.models.login.UserLogin;
import erp_microservices.e_commerce.repositories.UserLoginRepository;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static erp_microservices.encryption.Encrypter.encrypt;
import static fj.data.Option.fromNull;
import static java.util.Optional.empty;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class UserSteps {

	@Autowired
	private UserLoginRepository userLoginRepository;

	private String userId = "";
	private String password = "";
	private UserLogin expectedUserLogin;
	private Optional<UserLogin> actualUserLogin = empty();

	public UserSteps(UserLoginRepository userLoginRepository) {
		this.userLoginRepository = userLoginRepository;
	}

	@Given("a user registered with userId = $userId, password = $password")
	public void givenAUserRegisteredWithUsernamePassword(String userId, String password) {
		this.userId = userId;
		this.password = password;
		expectedUserLogin = new UserLogin(this.userId, this.password);
		expectedUserLogin = userLoginRepository.save(expectedUserLogin);
	}

	@Given("I have provided my username as $userId")
	public void givenIHaveProvidedMyUsernameAs(String userId) {
		this.userId = userId;
	}

	@Given("I have provided my password as $password")
	public void givenIHaveProvidedMyPasswordAs(String password) {
		this.password = password;
	}

	@Given("I have not provided a username")
	public void givenIHaveNotProvidedAUserId() {
		this.userId = "";
	}

	@Given("I have not provided a password")
	public void givenIHaveNotProvidedAPassword() {
		this.password = "";
	}


	@When("I login")
	public void iLogin() {
		actualUserLogin =userLoginRepository.findByUserId(this.userId);

	}

	@Then("I will be logged in")
	@Pending
	public void iWillBeLoggedIn() {
		assertTrue("The userlogin must retrievable by username", actualUserLogin.isPresent());
		UserLogin userLogin = actualUserLogin.get();
		assertEquals("The userid must not be null or blank", userId, userLogin.getUserId());
		assertFalse("The salt must not be null or blank", isEmpty(userLogin.getSalt()));
		assertFalse("The password must not be null or blank", isEmpty(userLogin.getPassword()));
		assertEquals("The password must be correctly encrypted", encrypt(password + userLogin.getSalt()), userLogin.getPassword());
	}

	@Then("I will get an error indicating a userId must be provided")
	@Pending
	public void thenIWillGetAnErrorIndicatingAUsernameMustBeProvided() {
		assertFalse("The userlogin must not be retrieved without a userId.", actualUserLogin.isPresent());
	}
}
