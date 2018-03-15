package erp_microservices.e_commerce.models.subscription;

import erp_microservices.e_commerce.models.productdescriptions.NeedType;
import erp_microservices.e_commerce.models.productdescriptions.PartyNeed;
import erp_microservices.model.PersistentEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Represents all the data needed for a subscription to Newsgroups, product
 * information, user groups, or other things that can be subscribed to.
 *
 * @author jim
 */
@Entity
public class Subscription extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@ManyToMany(mappedBy = "subscriptionsInvolved")
	private List<SubscriptionActivity> fullfilledVia;

	@ManyToOne
	private NeedType needType;

	/**
	 * UUID of OrderItem.
	 */
	@ElementCollection
	private List<UUID> orderedVia;

	/**
	 * UUId of CommunicationEvent.
	 */
	private UUID originatingFrom;

	@ManyToOne
	private PartyNeed partyNeed;

	/**
	 * UUID for Product.
	 */
	private UUID product;

	/**
	 * UUId for ProductCategory.
	 */
	private UUID productCategory;

	/**
	 * UUID for ContactMechanism.
	 */
	private UUID sendTo;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	/**
	 * UUID for PartyRole.
	 */
	private UUID subscriber;

	/**
	 * UUID for PartyRole.
	 */
	private UUID subscriptionFor;

	@ManyToOne
	private SubscriptionType type;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<SubscriptionActivity> getFullfilledVia() {
		return fullfilledVia;
	}

	public void setFullfilledVia(List<SubscriptionActivity> fullfilledVia) {
		this.fullfilledVia = fullfilledVia;
	}

	public NeedType getNeedType() {
		return needType;
	}

	public void setNeedType(NeedType needType) {
		this.needType = needType;
	}

	public List<UUID> getOrderedVia() {
		return orderedVia;
	}

	public void setOrderedVia(List<UUID> orderedVia) {
		this.orderedVia = orderedVia;
	}

	public UUID getOriginatingFrom() {
		return originatingFrom;
	}

	public void setOriginatingFrom(UUID originatingFrom) {
		this.originatingFrom = originatingFrom;
	}

	public PartyNeed getPartyNeed() {
		return partyNeed;
	}

	public void setPartyNeed(PartyNeed partyNeed) {
		this.partyNeed = partyNeed;
	}

	public UUID getProduct() {
		return product;
	}

	public void setProduct(UUID product) {
		this.product = product;
	}

	public UUID getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(UUID productCategory) {
		this.productCategory = productCategory;
	}

	public UUID getSendTo() {
		return sendTo;
	}

	public void setSendTo(UUID sendTo) {
		this.sendTo = sendTo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public UUID getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(UUID subscriber) {
		this.subscriber = subscriber;
	}

	public UUID getSubscriptionFor() {
		return subscriptionFor;
	}

	public void setSubscriptionFor(UUID subscriptionFor) {
		this.subscriptionFor = subscriptionFor;
	}

	public SubscriptionType getType() {
		return type;
	}

	public void setType(SubscriptionType type) {
		this.type = type;
	}

}
