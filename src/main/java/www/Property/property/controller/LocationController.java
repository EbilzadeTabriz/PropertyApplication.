package www.Property.property.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.LocationDto;
import www.Property.property.dto.respnseRequest.LocationRequest;
import www.Property.property.entity.Location;
import www.Property.property.manager.LocationImple;

import java.util.List;

@RestController
@Component
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {
    private final LocationImple locationImple;
    Logger logger = LoggerFactory.getLogger(LocationController.class);

    @GetMapping
    public List<LocationDto> getAllLocation() {
        logger.info("done");
        return locationImple.getAllLocation();
    }

    @GetMapping("/{locationId}")
    public LocationDto getByLocationId(@PathVariable Long locationId) {
        logger.info("got");
        return locationImple.getByLocationId(locationId);
    }

    @DeleteMapping("/{locationId}")
    public void deletByLocationId(@PathVariable Long locationId) {
        logger.info("deleted");
        locationImple.deletByLocationId(locationId);

    }

    @DeleteMapping
    public void deleetAllLocations() {
        logger.info("deleted all");
        locationImple.deleetAllLocations();
    }


    @PostMapping("/{location}")
    public ResponseEntity<Void> saveAllLocations(@RequestBody @Valid List<LocationRequest> location) {
        logger.info("saved");
        locationImple.saveAllLocations(location);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{Id}")
    public void updateAllLocation(@PathVariable Long Id, @RequestBody Location location) {
        logger.info("updated");
        locationImple.updateAllLocation(Id, location);
    }


}
