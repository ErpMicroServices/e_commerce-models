package erp_microservices.e_commerce.models.webvisit;

import erp_microservices.model.Type;

import javax.persistence.Entity;

@Entity
public class PlatformType extends Type {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String platformVersion;

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

}
