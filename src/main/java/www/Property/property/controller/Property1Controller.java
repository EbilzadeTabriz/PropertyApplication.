package www.Property.property.controller;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.Property1Dto;
import www.Property.property.dto.respnseRequest.Property1Request;
import www.Property.property.pagination.Property1PageResponse;
import www.Property.property.entity.Property1;
import www.Property.property.manager.Property1Imple;

@RestController
@Service
@RequestMapping("/property1")

public class Property1Controller {
    private final Property1Imple property1Imple;
    Logger logger = LoggerFactory.getLogger(PropertyTypeController.class);

    public Property1Controller(Property1Imple property1Imple) {
        this.property1Imple = property1Imple;
    }

    @GetMapping
    public Property1PageResponse getAll(@RequestParam(value = "page") int page,
                                        @RequestParam(value = "count") int count) {

        logger.info("done");

        return property1Imple.getAll(page, count);
    }

    @GetMapping("/{id}")
    public Property1Dto getById(@PathVariable Long id) {
        logger.info("got");
        return property1Imple.getById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        logger.info("deleted all");
        property1Imple.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        logger.info("deleted");
        property1Imple.deleteById(id);


    }

    @PutMapping("/{id}")
    public void updateProperty(@PathVariable Long id, @RequestBody @Valid Property1 property1) {
        logger.info("updated");
        property1Imple.updateProperty(id, property1);
    }

    @PostMapping("/{property1}")
    public ResponseEntity<Void> saveProperty(@RequestBody @Valid Property1Request property1Request) {
        property1Imple.saveProperty(property1Request);

        logger.info("saved");
        return new ResponseEntity<>(HttpStatus.CREATED);


    }

}

