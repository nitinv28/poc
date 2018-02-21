package boot.start.domain.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="dataelementtype")
public class DataElementType {

	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column(name="DataElementTypeID")
	private Integer dataElementTypeID;
	
	@Column(name="DataElementName",length=45)
	private String dataElementName;
	
	public Integer getDataElementTypeID() {
		return dataElementTypeID;
	}
	public void setDataElementTypeID(Integer dataElementTypeID) {
		this.dataElementTypeID = dataElementTypeID;
	}
	public String getDataElementName() {
		return dataElementName;
	}
	public void setDataElementName(String dataElementName) {
		this.dataElementName = dataElementName;
	}
	
}
