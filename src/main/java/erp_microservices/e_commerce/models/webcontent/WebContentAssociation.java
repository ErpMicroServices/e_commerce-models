package erp_microservices.e_commerce.models.webcontent;

import erp_microservices.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WebContentAssociation extends PersistentEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private WebContent forWebContent;

	@ManyToOne
	private FunctionType functionType;

	@ManyToOne
	private WebContent ofWebContent;

	private int xLoc;

	private int yLoc;


	public WebContent getForWebContent() {
		return forWebContent;
	}

	public void setForWebContent(WebContent forWebContent) {
		this.forWebContent = forWebContent;
	}

	public FunctionType getFunctionType() {
		return functionType;
	}

	public void setFunctionType(FunctionType functionType) {
		this.functionType = functionType;
	}

	public WebContent getOfWebContent() {
		return ofWebContent;
	}

	public void setOfWebContent(WebContent ofWebContent) {
		this.ofWebContent = ofWebContent;
	}

	public int getXLoc() {
		return xLoc;
	}

	public void setXLoc(int loc) {
		xLoc = loc;
	}

	public int getYLoc() {
		return yLoc;
	}

	public void setYLoc(int loc) {
		yLoc = loc;
	}

}
