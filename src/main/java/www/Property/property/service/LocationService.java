package www.Property.property.service;


import www.Property.property.dto.LocationDto;
import www.Property.property.dto.respnseRequest.LocationRequest;
import www.Property.property.entity.Location;

import java.util.List;

public interface LocationService {
    public List<LocationDto> getAllLocation();
    LocationDto getByLocationId(Long locationId);
    void deletByLocationId(Long locationId);
    void deleetAllLocations();
    void saveAllLocations(List<LocationRequest> locationRequest);
    void updateAllLocation(Long Id,Location location);




}
