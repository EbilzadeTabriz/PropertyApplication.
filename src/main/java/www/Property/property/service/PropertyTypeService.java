package www.Property.property.service;

import www.Property.property.dto.PropertyTypeDto;
import www.Property.property.dto.respnseRequest.PropertyTypeRequest;
import www.Property.property.entity.PropertyType;

import java.awt.*;
import java.util.List;

public interface PropertyTypeService {
    public List<PropertyTypeDto>  getAllPropertyType();
    PropertyTypeDto getByPropertyTypeId(Long propertyTypeId );
    void deleteAll();
    void deleteById(Long propertyTypeId);
     void savePropertyType(PropertyTypeRequest propertyTypeRequest);
    void updatePropertyType(Long propertyTypeId,PropertyType propertyType);

}
