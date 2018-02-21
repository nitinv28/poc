package boot.start.domain.applynow;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "elements")
public class Elements {

	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private int id;
	private String field;
	private boolean required ;
	private String placeHolder;
	private String errorMsz;
	private String type;
	private String inputElementID;
	private String inputElementName;
		
	
	public String getInputElementID() {
		return inputElementID;
	}
	public void setInputElementID(String inputElementID) {
		this.inputElementID = inputElementID;
	}
	public String getInputElementName() {
		return inputElementName;
	}
	public void setInputElementName(String inputElementName) {
		this.inputElementName = inputElementName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public String getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}
	public String getErrorMsz() {
		return errorMsz;
	}
	public void setErrorMsz(String errorMsz) {
		this.errorMsz = errorMsz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
}
