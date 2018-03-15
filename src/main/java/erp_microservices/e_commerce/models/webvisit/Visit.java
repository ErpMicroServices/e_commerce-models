package erp_microservices.e_commerce.models.webvisit;

import erp_microservices.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Visit extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<ServerHit> composedOf;

	private String cookie;

	/**
	 * UUID of WebAddress.
	 */
	private UUID hostedVia;

	/**
	 * UUID of Order.
	 */
	private UUID resultingIn;

	/**
	 * UUId of PartyRole.
	 */
	private UUID visitedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date visitEnd;

	@Temporal(TemporalType.TIMESTAMP)
	private Date visitStart;

	public List<ServerHit> getComposedOf() {
		return composedOf;
	}

	public void setComposedOf(List<ServerHit> composedOf) {
		this.composedOf = composedOf;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public UUID getHostedVia() {
		return hostedVia;
	}

	public void setHostedVia(UUID hostedVia) {
		this.hostedVia = hostedVia;
	}

	public UUID getResultingIn() {
		return resultingIn;
	}

	public void setResultingIn(UUID resultingIn) {
		this.resultingIn = resultingIn;
	}

	public UUID getVisitedBy() {
		return visitedBy;
	}

	public void setVisitedBy(UUID visitedBy) {
		this.visitedBy = visitedBy;
	}

	public Date getVisitEnd() {
		return visitEnd;
	}

	public void setVisitEnd(Date visitEnd) {
		this.visitEnd = visitEnd;
	}

	public Date getVisitStart() {
		return visitStart;
	}

	public void setVisitStart(Date visitStart) {
		this.visitStart = visitStart;
	}

}
