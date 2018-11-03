package unit.erp_microservices.e_commerce.models.login.UserLogin.ConstructorTests;

import erp_microservices.e_commerce.models.login.UserLogin;

public class WithUserIdPasswordEncryptsPasswordTest extends ConstructorTestTemplate {
	@Override
	public void whenTheFollowing() throws Exception {
		classUnderTest = new UserLogin(userId, password);

	}
}
