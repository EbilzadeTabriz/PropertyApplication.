package www.Property.property.mapper;

import org.mapstruct.Mapper;
import org.w3c.dom.stylesheets.LinkStyle;
import www.Property.property.dto.PropertyTypeDto;
import www.Property.property.dto.respnseRequest.PropertyTypeRequest;
import www.Property.property.entity.Property1;
import www.Property.property.entity.PropertyType;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyTypeMapper {
    PropertyTypeDto toPropertyTypeDto(PropertyType propertyType);
    PropertyType toPropertyType(PropertyTypeDto propertyTypeDto);
    List<PropertyTypeDto> toPropertyTypeDto(List<PropertyType> propertyTypeList);
    PropertyType toPropertyType(PropertyTypeRequest propertyTypeRequest);

}
