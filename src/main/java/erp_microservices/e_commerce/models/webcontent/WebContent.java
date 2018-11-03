package erp_microservices.e_commerce.models.webcontent;

import erp_microservices.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class WebContent extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String content;

	private String description;

	@OneToMany
	private List<WebContentRole> involving;

	/**
	 * UUID for WebAddress.
	 */
	private UUID locationOf;

	@OneToMany(mappedBy = "forWebContent")
	private List<WebContentAssociation> relatedTo;

	@ManyToOne
	private WebContentStatusType status;

	@ManyToOne
	private WebContentType type;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<WebContentRole> getInvolving() {
		return involving;
	}

	public void setInvolving(List<WebContentRole> involving) {
		this.involving = involving;
	}

	public UUID getLocationOf() {
		return locationOf;
	}

	public void setLocationOf(UUID locationOf) {
		this.locationOf = locationOf;
	}

	public List<WebContentAssociation> getRelatedTo() {
		return relatedTo;
	}

	public void setRelatedTo(List<WebContentAssociation> relatedTo) {
		this.relatedTo = relatedTo;
	}

	public WebContentStatusType getStatus() {
		return status;
	}

	public void setStatus(WebContentStatusType status) {
		this.status = status;
	}

	public WebContentType getType() {
		return type;
	}

	public void setType(WebContentType type) {
		this.type = type;
	}

}
