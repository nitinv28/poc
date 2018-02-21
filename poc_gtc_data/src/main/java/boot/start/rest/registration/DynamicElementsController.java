package boot.start.rest.registration;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.start.domain.registration.DataElement;
import boot.start.domain.registration.DataElementType;
import boot.start.domain.registration.DataElementWrapper;
import boot.start.domain.registration.DisplayDataElement;
import boot.start.domain.registration.DisplayElement;
import boot.start.repository.registration.DataElementServices;
import boot.start.repository.registration.DataElementTypeServices;
import boot.start.repository.registration.DisplayDataElementServices;
import boot.start.repository.registration.DisplayElementServices;

@RestController
public class DynamicElementsController {

	@Autowired DisplayDataElementServices displayDataElementServices;
	@Autowired DataElementServices dataElementServices;
	@Autowired DisplayElementServices displayElementServices;
	@Autowired DataElementTypeServices dataElementTypeServices;
	
	@GetMapping("/getElement")
	public Object getElement(){
		ArrayList<DataElementWrapper> dataElementWrappers = new ArrayList<DataElementWrapper>();
		
		for(DisplayDataElement displayDataElement:displayDataElementServices.findAll()){
			DataElementWrapper dataElementWrapper = new DataElementWrapper();
			dataElementWrapper.setRequired(displayDataElement.getDisplayDataElementIsMandatory());
			dataElementWrapper.setLabelID(displayDataElement.getReferenceDataElementID());
			dataElementWrapper.setControlID(displayDataElement.getReferenceDisplayElementID());
			DataElement dataElement  = dataElementServices.findOne(displayDataElement.getReferenceDataElementID());
			dataElementWrapper.setLabelName(dataElement.getDataElementName());
			dataElementWrapper.setControlTypeId(dataElement.getDataElementTypeID());
			DisplayElement displayElement  =displayElementServices.findOne(displayDataElement.getReferenceDisplayElementID());
			dataElementWrapper.setControlName(displayElement.getDisplayElementName());
			DataElementType dataElementType= dataElementTypeServices.findOne(dataElement.getDataElementTypeID());
			dataElementWrapper.setControlTypeName(dataElementType.getDataElementName());
			dataElementWrappers.add(dataElementWrapper);
			}
		
		
		return dataElementWrappers;
	}
}
