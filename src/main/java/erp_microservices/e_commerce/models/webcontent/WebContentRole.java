package erp_microservices.e_commerce.models.webcontent;

import erp_microservices.fields.DateTimeRange;
import erp_microservices.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class WebContentRole extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of Party.
	 */
	private UUID roleOf;

	@ManyToOne
	private WebContentRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getRoleOf() {
		return roleOf;
	}

	public void setRoleOf(UUID roleOf) {
		this.roleOf = roleOf;
	}

	public WebContentRoleType getType() {
		return type;
	}

	public void setType(WebContentRoleType type) {
		this.type = type;
	}

}
