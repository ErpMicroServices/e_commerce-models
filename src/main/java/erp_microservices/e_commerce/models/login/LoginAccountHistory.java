package erp_microservices.e_commerce.models.login;

import erp_microservices.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Keep track of when every user logs in,and when they logged out, and what
 * userId and password they used at the time.
 *
 * @author Jim.Barrows@gmail.com
 */
@SuppressWarnings("serial")
@Entity
public class LoginAccountHistory extends PersistentEntity {

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date loggedInFrom;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date loggedInThru;

	private String password;

	private String userId;

	public LoginAccountHistory() {

	}

	public LoginAccountHistory(Date from, String userId, String password) {
		setLoggedInFrom(from);
		setUserId(userId);
		setPassword(password);
	}

	/**
	 * @param from the from to set
	 */
	public void setLoggedInFrom(Date from) {
		this.loggedInFrom = from;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final LoginAccountHistory other = (LoginAccountHistory) obj;
		if (loggedInFrom == null) {
			if (other.loggedInFrom != null)
				return false;
		} else if (!loggedInFrom.equals(other.loggedInFrom))
			return false;
		if (loggedInThru == null) {
			if (other.loggedInThru != null)
				return false;
		} else if (!loggedInThru.equals(other.loggedInThru))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			return other.userId == null;
		} else return userId.equals(other.userId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((loggedInFrom == null) ? 0 : loggedInFrom.hashCode());
		result = prime * result + ((loggedInThru == null) ? 0 : loggedInThru.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	/**
	 * @return the from
	 */
	public Date getLoggedInFrom() {
		return loggedInFrom;
	}

	/**
	 * @return the thru
	 */
	public Date getLoggedInThru() {
		return loggedInThru;
	}

	/**
	 * @param thru the thru to set
	 */
	public void setLoggedInThru(Date thru) {
		this.loggedInThru = thru;
	}

	/**
	 * @return the password
	 */
	@NotEmpty
	public String getPassword() {
		return password;
	}

	/**
	 * @return the userId
	 */
	@NotEmpty
	public String getUserId() {
		return userId;
	}
}
