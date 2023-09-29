package www.Property.property.service;
import www.Property.property.dto.PropertyImageDto;
import www.Property.property.entity.PropertyImage;

import java.util.List;

public interface PropertyImageService {
    public List<PropertyImageDto> getAll();
    PropertyImageDto getById(Long id);
    void deleteAll();
    void deleteById(Long id);
    void updateImage(Long id,PropertyImage propertyImage);
    void saveImage(PropertyImage propertyImage);
    void saveImageLinks(PropertyImage propertyImage);

}
