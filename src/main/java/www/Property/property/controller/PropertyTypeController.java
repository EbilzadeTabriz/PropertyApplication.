package www.Property.property.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.PropertyTypeDto;
import www.Property.property.dto.respnseRequest.PropertyTypeRequest;
import www.Property.property.entity.PropertyType;
import www.Property.property.manager.PropertyTypeImple;

import java.util.List;

@Component
@RestController
@RequiredArgsConstructor
@RequestMapping("/property_type")
public class PropertyTypeController {
    private final PropertyTypeImple propertyTypeImple;
    Logger logger = LoggerFactory.getLogger(PropertyTypeController.class);

    @GetMapping
    public List<PropertyTypeDto> getAllPropertyType() {
        logger.info("done");

        return propertyTypeImple.getAllPropertyType();

    }
@GetMapping("/{propertyTypeId}")
    public PropertyTypeDto getByPropertyTypeId(@PathVariable Long propertyTypeId) {
        logger.info("got");
        return propertyTypeImple.getByPropertyTypeId(propertyTypeId);
    }

    @DeleteMapping
    public void deleteAll() {
        logger.info("deleted all");
        propertyTypeImple.deleteAll();

    }

    @DeleteMapping("/{propertyTypeId}")
    public void deleteById(@PathVariable Long propertyTypeId) {
        logger.info("deleted");
        propertyTypeImple.deleteById(propertyTypeId);

    }

    @PostMapping("/{propertyType}")
    public ResponseEntity<Void> savePropertyType(@RequestBody @Valid  PropertyTypeRequest propertyTypeRequest) {
        logger.info("saved");
        propertyTypeImple.savePropertyType(propertyTypeRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("/{propertyTypeId}")
    public void updatePropertyType(@PathVariable Long propertyTypeId, @RequestBody PropertyType propertyType) {
        logger.info("updated");
        propertyTypeImple.updatePropertyType(propertyTypeId, propertyType);
    }

}
