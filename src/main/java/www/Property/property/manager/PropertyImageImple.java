package www.Property.property.manager;

import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import www.Property.property.dto.PropertyImageDto;
import www.Property.property.entity.PropertyImage;


import www.Property.property.exception.PropertyimageNotFound;
import www.Property.property.mapper.PropertyImageMapper;
import www.Property.property.repository.PropertyImageRepository;
import www.Property.property.service.PropertyImageService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyImageImple implements PropertyImageService {
    private final PropertyImageRepository propertyImageRepository;
    private final PropertyImageMapper propertyImageMapper;

    @Override
    public List<PropertyImageDto> getAll() {

        return propertyImageRepository
                .findAll()
                .stream()
                .map(propertyImageMapper::toPropertyImageDto)
                .toList();
    }

    @Override
    public PropertyImageDto getById(Long id) {
        return propertyImageRepository
                .findById(id)
                .stream()
                .map(propertyImageMapper::toPropertyImageDto)
                .findFirst()
                .orElseThrow(()->new PropertyimageNotFound("PropertyImage not found with ID:"  + id));
    }

    @Override
    public void deleteAll() {
        propertyImageRepository.deleteAll();

    }

    @Override
    public void deleteById(Long id) {
        propertyImageRepository.deleteById(id);

    }

    @Override
    public void updateImage(Long id, PropertyImage propertyImage) {
        PropertyImage updated = propertyImageRepository.findById(id).get();
        updated.setId(propertyImage.getId());
        updated.setProperty_images(propertyImage.getProperty_images());

        propertyImageRepository.save(updated);

    }

    @Override
    public void saveImage(PropertyImage propertyImage) {
        propertyImageRepository.save(propertyImage);

    }

    @Override
    public void saveImageLinks(PropertyImage propertyImage) {
        propertyImageRepository.save(propertyImage);
    }
}
