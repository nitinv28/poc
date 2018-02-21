package boot.start.domain.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="displayelement")
public class DisplayElement {
	
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column(name="DisplayElementID")
	private Integer displayElementID;
	
	@Column(name="DisplayElementName", length=45)
	private String displayElementName;
	
	@Column(name="DisplayElementHTMLName", length=45)
	private String displayElementHTMLName;
	
	@Column(name="DisplayElementHelpID")
	private Integer displayElementHelpID;
	
	@Column(name="DisplayElementHasOptions")
	private Integer displayElementHasOptions;
	
	@Column(name="DisplayElementIsMultiSelect")
	private Integer displayElementIsMultiSelect;
	
	public Integer getDisplayElementID() {
		return displayElementID;
	}
	public void setDisplayElementID(Integer displayElementID) {
		this.displayElementID = displayElementID;
	}
	public String getDisplayElementName() {
		return displayElementName;
	}
	public void setDisplayElementName(String displayElementName) {
		this.displayElementName = displayElementName;
	}
	public String getDisplayElementHTMLName() {
		return displayElementHTMLName;
	}
	public void setDisplayElementHTMLName(String displayElementHTMLName) {
		this.displayElementHTMLName = displayElementHTMLName;
	}
	public Integer getDisplayElementHelpID() {
		return displayElementHelpID;
	}
	public void setDisplayElementHelpID(Integer displayElementHelpID) {
		this.displayElementHelpID = displayElementHelpID;
	}
	public Integer getDisplayElementHasOptions() {
		return displayElementHasOptions;
	}
	public void setDisplayElementHasOptions(Integer displayElementHasOptions) {
		this.displayElementHasOptions = displayElementHasOptions;
	}
	public Integer getDisplayElementIsMultiSelect() {
		return displayElementIsMultiSelect;
	}
	public void setDisplayElementIsMultiSelect(Integer displayElementIsMultiSelect) {
		this.displayElementIsMultiSelect = displayElementIsMultiSelect;
	}
	

}
