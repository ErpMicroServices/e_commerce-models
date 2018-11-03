package erp_microservices.e_commerce.models.login;

import erp_microservices.model.PersistentEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import fj.data.Option;

import javax.persistence.*;
import java.util.*;

import static erp_microservices.encryption.Encrypter.encrypt;
import static fj.data.Option.fromNull;
import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * The login for a user also specifies which pages, or web addresses that login
 * may view.
 * The password is encrypted when you use the constructor only.
 *
 * @author Jim.Barrows@gmail.com
 * @See The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421
 */
@SuppressWarnings("serial")
@Entity
public class UserLogin extends PersistentEntity {

	private boolean active = false;

	@OneToMany(mappedBy = "preferenceFor")
	private Map<String, WebUserPreference> governedBy = new HashMap<String, WebUserPreference>();

	@OneToMany(cascade = CascadeType.ALL)
	@OrderBy(value = "loggedInFrom")
	private List<LoginAccountHistory> having = new ArrayList<LoginAccountHistory>();


	/**
	 * UUID for Party the user login belongs to.
	 */
	private UUID loginFor = null;

	/**
	 * UUID for WebAddress this login is for.
	 */
	private UUID loginTo = null;

	/**
	 * The password should always be encrypted and salted.  The setter bypasses this so that JPA can set the value from the
	 * database, without doubly encrypting it.  Use @encryptPassword method, or one of the constructors instead of the
	 * setter.
	 */
	@NotEmpty
	@Length(min = 8)
	private String password = "";

	/**
	 * This field is used in encrypting the password in order to mitigate dictionary hash attacks.
	 */
	@NotEmpty
	private String salt = "";

	@NotEmpty
	private String userId = "";

	public UserLogin() {
	}

	public UserLogin(String userId, String password) {
		String salt = UUID.randomUUID().toString();
		encryptPassword(password);
		this.userId = userId;
	}

	public void addLoginAccountHistory(LoginAccountHistory loginAccountHistory) {
		having.add(loginAccountHistory);
	}

	protected void encryptPassword(String password) {
		if (isEmpty(salt)) {
			salt = UUID.randomUUID().toString();
		}
		this.password = encrypt(password + salt);
	}

	public void changePassword(String newPassword) {
		encryptPassword(newPassword);
	}

	/**
	 * @return the governedBy
	 */
	public Map<String, WebUserPreference> getGovernedBy() {
		return governedBy;
	}

	/**
	 * @param governedBy the governedBy to set
	 */
	public void setGovernedBy(Map<String, WebUserPreference> governedBy) {
		this.governedBy = governedBy;
	}

	/**
	 * @return the having
	 */
	public List<LoginAccountHistory> getHaving() {
		return having;
	}

	/**
	 * @param having the having to set
	 */
	public void setHaving(List<LoginAccountHistory> having) {
		this.having = having;
	}

	public Option<LoginAccountHistory> lastLogin() {
		return fromNull(having.get(having.size() - 1));
	}

	/**
	 * @return the loginFor
	 */
	public Option<UUID> getLoginFor() {
		return fromNull(loginFor);
	}

	/**
	 * @param loginFor the loginFor to set
	 */
	public void setLoginFor(Option<UUID> loginFor) {
		this.loginFor = loginFor.toNull();
	}


	/**
	 * @return the loginTo
	 */
	public Option<UUID> getLoginTo() {
		return fromNull(loginTo);
	}

	/**
	 * @param loginTo the loginTo to set
	 */
	public void setLoginTo(Option<UUID> loginTo) {
		this.loginTo = loginTo.toNull();
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.setId(id);
	}


	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setLoginFor(final UUID loginFor) {
		this.loginFor = loginFor;
	}

	public void setLoginTo(final UUID loginTo) {
		this.loginTo = loginTo;
	}
}
