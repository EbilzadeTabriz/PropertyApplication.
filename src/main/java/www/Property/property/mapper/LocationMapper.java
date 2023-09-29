package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.LocationDto;
import www.Property.property.dto.respnseRequest.LocationRequest;
import www.Property.property.entity.Location;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    LocationDto toLocationDto(Location location);
    Location toLocation(LocationDto locationDto);
    List<LocationDto> toLocationDto(List<Location> locationList);
    Location toLocationRe(LocationRequest locationRequest);
}
