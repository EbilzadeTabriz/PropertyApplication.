package www.Property.property.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.PropertyImageDto;
import www.Property.property.entity.PropertyImage;
import www.Property.property.manager.PropertyImageImple;

import java.util.List;

@RestController
@Component
@RequestMapping("/property_image")
@RequiredArgsConstructor
public class PropertyImageController {
    private final PropertyImageImple propertyImageImple;
    Logger logger = LoggerFactory.getLogger(PropertyTypeController.class);

    @GetMapping
    public List<PropertyImageDto> getAll() {
        logger.info("done");
        return propertyImageImple.getAll();
    }

    @GetMapping("/{id}")
    public PropertyImageDto getById(@PathVariable Long id) {
        logger.info("got");
        return propertyImageImple.getById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        logger.info("deleted all");
        propertyImageImple.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        logger.info("deleted");
        propertyImageImple.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateImage(@PathVariable Long id, @RequestBody PropertyImage propertyImage) {
        logger.info("updated");
        propertyImageImple.updateImage(id, propertyImage);
    }

    @PostMapping("/{propertyImage}")
    public void saveImage(@RequestBody PropertyImage propertyImage) {
        logger.info("saved");
        propertyImageImple.saveImage(propertyImage);

    }

    @PostMapping("/{propertyImageLink}")
    public void saveImageLinks(@RequestBody PropertyImage propertyImage) {
        logger.info("saved");
        propertyImageImple.saveImage(propertyImage);
    }

}

