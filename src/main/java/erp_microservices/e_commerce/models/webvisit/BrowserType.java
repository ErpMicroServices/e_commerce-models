package erp_microservices.e_commerce.models.webvisit;

import erp_microservices.model.Type;

import javax.persistence.Entity;

@Entity
public class BrowserType extends Type {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String browserVersion;

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

}
