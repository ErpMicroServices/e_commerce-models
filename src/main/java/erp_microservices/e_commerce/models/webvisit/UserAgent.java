package erp_microservices.e_commerce.models.webvisit;

import erp_microservices.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class UserAgent extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private BrowserType browser;

	@ManyToOne
	private UserAgentMethodType methodType;

	@ManyToOne
	private PlatformType platform;

	@ManyToOne
	private ProtocolType protocolType;

	@ManyToOne
	private UserAgentType type;

	public BrowserType getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserType browser) {
		this.browser = browser;
	}

	public UserAgentMethodType getMethodType() {
		return methodType;
	}

	public void setMethodType(UserAgentMethodType methodType) {
		this.methodType = methodType;
	}

	public PlatformType getPlatform() {
		return platform;
	}

	public void setPlatform(PlatformType platform) {
		this.platform = platform;
	}

	public ProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.protocolType = protocolType;
	}

	public UserAgentType getType() {
		return type;
	}

	public void setType(UserAgentType type) {
		this.type = type;
	}

}
