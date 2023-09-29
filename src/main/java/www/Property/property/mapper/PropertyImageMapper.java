package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.Property1Dto;
import www.Property.property.dto.PropertyImageDto;
import www.Property.property.entity.PropertyImage;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyImageMapper {
    PropertyImageDto toPropertyImageDto(PropertyImage propertyImage);
    PropertyImage toPropertyImage(PropertyImageDto propertyImageDto);
    List<PropertyImageDto> toPropertyImageDto(List<PropertyImage> propertyImageList);
}
