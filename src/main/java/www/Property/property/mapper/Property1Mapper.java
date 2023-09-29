package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.Property1Dto;
import www.Property.property.dto.respnseRequest.Property1Request;
import www.Property.property.entity.Property1;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Property1Mapper {
    Property1Dto toProperty1Dto(Property1 property1);
    Property1 toProperty1(Property1Dto property1Dto);
    List<Property1Dto> toProperty1Dto(List<Property1> property1List);
    Property1 toProperty1(Property1Request property1Request);
}
