package behavior.steps;

import erp_microservices.e_commerce.models.login.UserLogin;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class UserSteps {

	private String username = "";
	private String password = "";
	private UserLogin expectedUser;

	public UserSteps() {
		expectedUser = new UserLogin();
	}

	@Given("a user registered with userId = $userId, password = $password")
	@Pending
	public void givenAUserRegisteredWithUsernamePassword(String usermame, String password) {
		// PENDING
	}

	@Given("I have provided my userId as $userId")
	@Pending
	public void givenIHaveProvidedMyUsernameAs(String username) {
		// PENDING
	}

	@Given("I have provided my password as %password")
	@Pending
	public void givenIHaveProvidedMyPasswordAs(String password) {
		// PENDING
	}

	@When("I login")
	@Pending
	public void iLogin() {
		//PENDING
	}

	@Then("I will be logged in")
	@Pending
	public void iWillBeLoggedIn() {

	}
}
