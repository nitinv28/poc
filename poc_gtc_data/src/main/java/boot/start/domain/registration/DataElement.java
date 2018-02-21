package boot.start.domain.registration;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="dataelement")
public class DataElement {
	
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column(name="DataElementID")
	private Integer dataElementID;
	
	@NotNull
	@Column(name="DataElementName", length= 45)
	private String dataElementName;
	
	@Column(name="DataElementTypeID")
	private Integer dataElementTypeID;
	
	@Column(name="DataElementSourceID")
	private Integer dataElementSourceID;
	
	@Column(name="DataElementStatusID")
	private Integer dataElementStatusID;
	
	@Column(name="DataElementLastModifiedByUserID")
	@NotNull
	private Integer dataElementLastModifiedByUserID;
	
	@Column(name="DataElementLastModifiedOnDateTime")
	private Date dataElementLastModifiedOnDateTime;

	public Integer getDataElementID() {
		return dataElementID;
	}

	public void setDataElementID(Integer dataElementID) {
		this.dataElementID = dataElementID;
	}

	public String getDataElementName() {
		return dataElementName;
	}

	public void setDataElementName(String dataElementName) {
		this.dataElementName = dataElementName;
	}

	public Integer getDataElementTypeID() {
		return dataElementTypeID;
	}

	public void setDataElementTypeID(Integer dataElementTypeID) {
		this.dataElementTypeID = dataElementTypeID;
	}

	public Integer getDataElementSourceID() {
		return dataElementSourceID;
	}

	public void setDataElementSourceID(Integer dataElementSourceID) {
		this.dataElementSourceID = dataElementSourceID;
	}

	public Integer getDataElementStatusID() {
		return dataElementStatusID;
	}

	public void setDataElementStatusID(Integer dataElementStatusID) {
		this.dataElementStatusID = dataElementStatusID;
	}

	public Integer getDataElementLastModifiedByUserID() {
		return dataElementLastModifiedByUserID;
	}

	public void setDataElementLastModifiedByUserID(
			Integer dataElementLastModifiedByUserID) {
		this.dataElementLastModifiedByUserID = dataElementLastModifiedByUserID;
	}

	public Date getDataElementLastModifiedOnDateTime() {
		return dataElementLastModifiedOnDateTime;
	}

	public void setDataElementLastModifiedOnDateTime(
			Date dataElementLastModifiedOnDateTime) {
		this.dataElementLastModifiedOnDateTime = dataElementLastModifiedOnDateTime;
	}
	

}
