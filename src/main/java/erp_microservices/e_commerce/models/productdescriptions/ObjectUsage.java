package erp_microservices.e_commerce.models.productdescriptions;

import erp_microservices.fields.DateTimeRange;
import erp_microservices.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class ObjectUsage extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

}
