package erp_microservices.e_commerce.models.login;

import erp_microservices.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WebUserPreference extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private WebPreferenceType describedBy;

	@ManyToOne
	private UserLogin preferenceFor;

	@NotEmpty
	@Column(name = "preferenceValue")
	private String value = "default";

	public String getValue() {
		return value;
	}

	public void setValue(String newValue) {
		this.value = newValue;
	}

	/**
	 * @return the describedBy
	 */

	public WebPreferenceType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @param describedBy the describedBy to set
	 */
	public void setDescribedBy(WebPreferenceType describedBy) {
		this.describedBy = describedBy;
	}

	public UserLogin getPreferenceFor() {
		return preferenceFor;
	}

	public void setPreferenceFor(UserLogin preferenceFor) {
		this.preferenceFor = preferenceFor;
	}
}
