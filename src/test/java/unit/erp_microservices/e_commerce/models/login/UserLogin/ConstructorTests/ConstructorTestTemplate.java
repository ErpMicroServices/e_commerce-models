package unit.erp_microservices.e_commerce.models.login.UserLogin.ConstructorTests;

import erp_microservices.e_commerce.models.login.LoginAccountHistory;
import erp_microservices.e_commerce.models.login.UserLogin;
import erp_microservices.e_commerce.models.login.WebUserPreference;
import test.utils.GwtTemplate;

import java.util.*;

import static erp_microservices.encryption.Encrypter.encrypt;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public abstract class ConstructorTestTemplate extends GwtTemplate {
	protected UserLogin classUnderTest;
	protected String password;
	protected String userId;
	protected boolean active = true;
	protected Map<String, WebUserPreference> goverenedBy = new HashMap<>();
	protected List<LoginAccountHistory> having = new ArrayList<>();
	protected UUID loginFor = UUID.randomUUID();
	protected UUID loginTo = UUID.randomUUID();

	@Override
	public void givenTheFollowing() {
		classUnderTest = null;
		password = "ThePasswordIs";
		userId = "ChesterTester";
		active = true;
	}


	@Override
	public void thenTheFollowing() {
		assertFalse("UserId cannot be blank or null", isEmpty(classUnderTest.getUserId()));
		assertFalse("Password cannot be blank or null", isEmpty(classUnderTest.getPassword()));
		assertFalse("Salt cannot be blank or empty", isEmpty(classUnderTest.getSalt()));
		assertEquals("Password must encrypted using the salt", encrypt(password + classUnderTest.getSalt()), classUnderTest.getPassword());
	}
}
