package erp_microservices.e_commerce.models.subscription;

import erp_microservices.model.PersistentEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class SubscriptionActivity extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	private Date sentOne;

	@ManyToMany
	private List<Subscription> subscriptionsInvolved;


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getSentOne() {
		return sentOne;
	}

	public void setSentOne(Date sentOne) {
		this.sentOne = sentOne;
	}

	public List<Subscription> getSubscriptionsInvolved() {
		return subscriptionsInvolved;
	}

	public void setSubscriptionsInvolved(List<Subscription> subscriptionsInvovled) {
		this.subscriptionsInvolved = subscriptionsInvovled;
	}

}
