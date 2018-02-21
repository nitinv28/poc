package boot.start.domain.registration;

public class DataElementWrapper {
	
	private Integer labelID;
	private String labelName;
	private Integer controlID;
	private String controlName;
	private Integer controlTypeId;
	private Integer required;
	private String controlTypeName;
	public Integer getLabelID() {
		return labelID;
	}
	public void setLabelID(Integer labelID) {
		this.labelID = labelID;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	public Integer getControlID() {
		return controlID;
	}
	public void setControlID(Integer controlID) {
		this.controlID = controlID;
	}
	public String getControlName() {
		return controlName;
	}
	public void setControlName(String controlName) {
		this.controlName = controlName;
	}
	public Integer getControlTypeId() {
		return controlTypeId;
	}
	public void setControlTypeId(Integer controlTypeId) {
		this.controlTypeId = controlTypeId;
	}
	public String getControlTypeName() {
		return controlTypeName;
	}
	public void setControlTypeName(String controlTypeName) {
		this.controlTypeName = controlTypeName;
	}
	public Integer getRequired() {
		return required;
	}
	public void setRequired(Integer required) {
		this.required = required;
	}
	
}
