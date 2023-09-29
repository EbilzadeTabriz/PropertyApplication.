package www.Property.property.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.RecentlyViewedPropertyDto;
import www.Property.property.dto.respnseRequest.RecentlyViewedPropertyRequest;
import www.Property.property.entity.RecentlyViewedProperty;
import www.Property.property.manager.RecentlyViewedPropertyImple;

import java.util.List;

@RestController
@Component
@RequiredArgsConstructor
@RequestMapping(("/viewers"))
public class RecentlyViewedPropertyController {
    private final RecentlyViewedPropertyImple recentlyViewedPropertyImple;
    Logger logger = LoggerFactory.getLogger(RecentlyViewedPropertyController.class);

    @GetMapping
    public List<RecentlyViewedPropertyDto> getAllView() {
        logger.info("done");
        return recentlyViewedPropertyImple.getAllView();
    }

    @PostMapping("/{recentlyViewedProperty}")
    public ResponseEntity<Void> saveViews(@RequestBody @Valid RecentlyViewedPropertyRequest recentlyViewedPropertyRequest  ) {
        logger.info("saved");
        recentlyViewedPropertyImple.saveViews(recentlyViewedPropertyRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("/{recentlyViewedId}")
    public void updateViews(@PathVariable Long recentlyViewedId, @RequestBody RecentlyViewedProperty recentlyViewedProperty) {
        logger.info("updated");
        recentlyViewedPropertyImple.updateViews(recentlyViewedId, recentlyViewedProperty);
    }

    @DeleteMapping
    public void deleteAll() {
        logger.info("deleted all");
        recentlyViewedPropertyImple.deleteAll();

    }

    @DeleteMapping("/{recentlyViewedId}")
    public void deleteViewsById(@PathVariable Long recentlyViewedId) {
        logger.info("deleted");
        recentlyViewedPropertyImple.deleteViewsById(recentlyViewedId);

    }

}
