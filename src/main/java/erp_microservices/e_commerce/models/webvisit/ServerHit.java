package erp_microservices.e_commerce.models.webvisit;

import erp_microservices.e_commerce.models.login.UserLogin;
import erp_microservices.e_commerce.models.webcontent.WebContent;
import erp_microservices.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
public class ServerHit extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private long bytes;

	@ManyToOne
	private UserLogin fromUserLogin;

	@ManyToOne
	private WebContent hitOn;

	/**
	 * UUID of IpAddress.
	 */
	private UUID identifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date occuredOn;

	@ManyToOne
	private Visit partOf;

	/**
	 * UUId of WebAddress.
	 */
	private UUID referredVia;

	@ManyToOne
	private ServerHitStatusType status;

	@ManyToOne
	private UserAgent userAgent;

	public long getBytes() {
		return bytes;
	}

	public void setBytes(long bytes) {
		this.bytes = bytes;
	}

	public UserLogin getFromUserLogin() {
		return fromUserLogin;
	}

	public void setFromUserLogin(UserLogin fromUserLogin) {
		this.fromUserLogin = fromUserLogin;
	}

	public WebContent getHitOn() {
		return hitOn;
	}

	public void setHitOn(WebContent hitOn) {
		this.hitOn = hitOn;
	}

	public UUID getIdentifiedBy() {
		return identifiedBy;
	}

	public void setIdentifiedBy(UUID identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public Date getOccuredOn() {
		return occuredOn;
	}

	public void setOccuredOn(Date occuredOn) {
		this.occuredOn = occuredOn;
	}

	public Visit getPartOf() {
		return partOf;
	}

	public void setPartOf(Visit partOf) {
		this.partOf = partOf;
	}

	public UUID getReferredVia() {
		return referredVia;
	}

	public void setReferredVia(UUID referredVia) {
		this.referredVia = referredVia;
	}

	public ServerHitStatusType getStatus() {
		return status;
	}

	public void setStatus(ServerHitStatusType status) {
		this.status = status;
	}

	public UserAgent getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(UserAgent userAgent) {
		this.userAgent = userAgent;
	}

}
