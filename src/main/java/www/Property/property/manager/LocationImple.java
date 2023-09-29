package www.Property.property.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import www.Property.property.dto.LocationDto;
import www.Property.property.dto.respnseRequest.LocationRequest;
import www.Property.property.entity.Location;
import www.Property.property.exception.LocationNotFound;
import www.Property.property.mapper.LocationMapper;
import www.Property.property.repository.LocationRepository;
import www.Property.property.service.LocationService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LocationImple implements LocationService {
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    @Override
    public List<LocationDto> getAllLocation() {
        return locationRepository
                .findAll()
                .stream()
                .map(locationMapper::toLocationDto)
                .toList();
    }

    @Override
    public LocationDto getByLocationId(Long locationId) {
        return locationRepository
                .findById(locationId)
                .stream()
                .map(locationMapper::toLocationDto)
                .findFirst()
                .orElseThrow(() -> new LocationNotFound("Property not found with ID:" + locationId));
    }

    @Override
    public void deletByLocationId(Long locationId) {
        locationRepository.deleteById(locationId);

    }

    @Override
    public void deleetAllLocations() {
        locationRepository.deleteAll();
    }

    @Override
    public void saveAllLocations(List<LocationRequest> location) {
      List<Location> locations = location
              .stream()
              .map(locationMapper::toLocationRe)
              .collect(Collectors.toList());
      locationRepository.saveAll(locations );

    }

    @Override
    public void updateAllLocation(Long Id, Location location) {
        Location updated = locationRepository.findById(Id).get();
        updated.setLocationId(location.getLocationId());
        updated.setCity(location.getCity());
        updated.setDistrict(location.getDistrict());
        updated.setNeighborhood(location.getNeighborhood());
        locationRepository.save(updated);

    }
}
