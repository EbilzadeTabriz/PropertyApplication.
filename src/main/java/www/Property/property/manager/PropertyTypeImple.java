package www.Property.property.manager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import www.Property.property.dto.PropertyTypeDto;
import www.Property.property.dto.respnseRequest.PropertyTypeRequest;
import www.Property.property.entity.PropertyType;
import www.Property.property.exception.PropertyTyperNotFoundException;
import www.Property.property.mapper.PropertyTypeMapper;
import www.Property.property.repository.PropertyTypeRepository;
import www.Property.property.service.PropertyTypeService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PropertyTypeImple implements PropertyTypeService {
    private final PropertyTypeRepository propertyTypeRepository;
private final PropertyTypeMapper propertyTypeMapper;
    @Override
    public List<PropertyTypeDto> getAllPropertyType() {
        return propertyTypeRepository
                .findAll()
                .stream()
                .map(propertyTypeMapper::toPropertyTypeDto)
                .toList();
    }

    @Override
    public PropertyTypeDto getByPropertyTypeId(Long propertyTypeId) {
        return propertyTypeRepository
                .findById(propertyTypeId)
                .stream().
                map(propertyTypeMapper::toPropertyTypeDto)
                .findFirst().
        orElseThrow(()->new PropertyTyperNotFoundException("Property not found with ID: " + propertyTypeId));
    }

    @Override
    public void deleteAll() {
        propertyTypeRepository.deleteAll();

    }

    @Override
    public void deleteById(Long propertyTypeId) {
        propertyTypeRepository.deleteById(propertyTypeId);

    }

    @Override
    public void savePropertyType(PropertyTypeRequest propertyType) {
        propertyTypeRepository.save(propertyTypeMapper.toPropertyType(propertyType));

    }

    @Override
    public void updatePropertyType(Long propertyTypeId, PropertyType propertyType) {
        PropertyType updated  = propertyTypeRepository.findById(propertyTypeId).get();
        updated.setPropertyTypeId(propertyType.getPropertyTypeId());
        updated.setName(propertyType.getName());
        updated.setDescription(propertyType.getDescription());
        updated.setImage(propertyType.getImage());

        propertyTypeRepository.save(updated);

    }
}
