package erp_microservices.e_commerce.models.productdescriptions;

import erp_microservices.e_commerce.models.webvisit.ServerHit;
import erp_microservices.model.PersistentEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class PartyNeed extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	/**
	 * UUID for CommunicationEvent.
	 */
	private UUID discoverdViaCommunicationEvent;

	@ManyToOne
	private ServerHit discoveredViaServerHit;

	/**
	 * UUID for PartyRole.
	 */
	private UUID forConsumer;

	/**
	 * UUID for Product.
	 */
	private UUID forProduct;

	/**
	 * UUID for ProductCategory.
	 */
	private UUID forProductCategory;

	@Temporal(TemporalType.TIMESTAMP)
	private Date identifiedOn;

	@ManyToOne
	private NeedType type;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UUID getDiscoverdViaCommunicationEvent() {
		return discoverdViaCommunicationEvent;
	}

	public void setDiscoverdViaCommunicationEvent(UUID discoverdViaCommunicationEvent) {
		this.discoverdViaCommunicationEvent = discoverdViaCommunicationEvent;
	}

	public ServerHit getDiscoveredViaServerHit() {
		return discoveredViaServerHit;
	}

	public void setDiscoveredViaServerHit(ServerHit discoveredViaServerHit) {
		this.discoveredViaServerHit = discoveredViaServerHit;
	}

	public UUID getForConsumer() {
		return forConsumer;
	}

	public void setForConsumer(UUID forConsumer) {
		this.forConsumer = forConsumer;
	}

	public UUID getForProduct() {
		return forProduct;
	}

	public void setForProduct(UUID forProduct) {
		this.forProduct = forProduct;
	}

	public UUID getForProductCategory() {
		return forProductCategory;
	}

	public void setForProductCategory(UUID forProductCategory) {
		this.forProductCategory = forProductCategory;
	}

	public Date getIdentifiedOn() {
		return identifiedOn;
	}

	public void setIdentifiedOn(Date identifiedOn) {
		this.identifiedOn = identifiedOn;
	}

	public NeedType getType() {
		return type;
	}

	public void setType(NeedType type) {
		this.type = type;
	}

}
