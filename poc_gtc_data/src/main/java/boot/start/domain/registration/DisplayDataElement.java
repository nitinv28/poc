package boot.start.domain.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="displaydataelement")
public class DisplayDataElement {
	
	
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column(name="DisplayDataElementID")
	private Integer displayDataElementID;
	
	
	@Column(name="ReferenceDataElementID")
	@NotNull
	private Integer referenceDataElementID;
	
	@NotNull
	@Column(name="ReferenceDisplayElementID")
	private Integer referenceDisplayElementID;
	
	@Column(name="DisplayDataElementIsMandatory")
	private Integer displayDataElementIsMandatory;
	
	@Column(name="DisplayDataElementBehaviorID")
	private Integer displayDataElementBehaviorID;
	
	@Column(name="DisplayDataElementCoordinates", length=45)
	private String displayDataElementCoordinates;
	
	@Column(name="DisplayDataElementOrder")
	private Integer displayDataElementOrder;
	
	@Column(name="DisplayDataElementHelpID")
	private Integer displayDataElementHelpID;
	
	@Column(name="DisplayDataElementDefaultValue", length=45)
	private String displayDataElementDefaultValue;
	
	@Column(name="DisplayDataElementStatusID")
	private Integer displayDataElementStatusID;

	public Integer getDisplayDataElementID() {
		return displayDataElementID;
	}

	public void setDisplayDataElementID(Integer displayDataElementID) {
		this.displayDataElementID = displayDataElementID;
	}

	public Integer getReferenceDataElementID() {
		return referenceDataElementID;
	}

	public void setReferenceDataElementID(Integer referenceDataElementID) {
		this.referenceDataElementID = referenceDataElementID;
	}

	public Integer getReferenceDisplayElementID() {
		return referenceDisplayElementID;
	}

	public void setReferenceDisplayElementID(Integer referenceDisplayElementID) {
		this.referenceDisplayElementID = referenceDisplayElementID;
	}

	public Integer getDisplayDataElementIsMandatory() {
		return displayDataElementIsMandatory;
	}

	public void setDisplayDataElementIsMandatory(Integer displayDataElementIsMandatory) {
		this.displayDataElementIsMandatory = displayDataElementIsMandatory;
	}

	public Integer getDisplayDataElementBehaviorID() {
		return displayDataElementBehaviorID;
	}

	public void setDisplayDataElementBehaviorID(Integer displayDataElementBehaviorID) {
		this.displayDataElementBehaviorID = displayDataElementBehaviorID;
	}

	public String getDisplayDataElementCoordinates() {
		return displayDataElementCoordinates;
	}

	public void setDisplayDataElementCoordinates(
			String displayDataElementCoordinates) {
		this.displayDataElementCoordinates = displayDataElementCoordinates;
	}

	public Integer getDisplayDataElementOrder() {
		return displayDataElementOrder;
	}

	public void setDisplayDataElementOrder(Integer displayDataElementOrder) {
		this.displayDataElementOrder = displayDataElementOrder;
	}

	public Integer getDisplayDataElementHelpID() {
		return displayDataElementHelpID;
	}

	public void setDisplayDataElementHelpID(Integer displayDataElementHelpID) {
		this.displayDataElementHelpID = displayDataElementHelpID;
	}

	public String getDisplayDataElementDefaultValue() {
		return displayDataElementDefaultValue;
	}

	public void setDisplayDataElementDefaultValue(
			String displayDataElementDefaultValue) {
		this.displayDataElementDefaultValue = displayDataElementDefaultValue;
	}

	public Integer getDisplayDataElementStatusID() {
		return displayDataElementStatusID;
	}

	public void setDisplayDataElementStatusID(Integer displayDataElementStatusID) {
		this.displayDataElementStatusID = displayDataElementStatusID;
	}
}
