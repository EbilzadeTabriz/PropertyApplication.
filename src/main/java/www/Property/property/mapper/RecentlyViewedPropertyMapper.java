package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.RecentlyViewedPropertyDto;
import www.Property.property.dto.respnseRequest.RecentlyViewedPropertyRequest;
import www.Property.property.entity.RecentlyViewedProperty;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecentlyViewedPropertyMapper {
    RecentlyViewedPropertyDto toRecentlyViewedPropertyDto(RecentlyViewedProperty recentlyViewedProperty);
    RecentlyViewedProperty toRecentlyViewedProperty(RecentlyViewedPropertyDto recentlyViewedPropertyDto);
    List<RecentlyViewedPropertyDto> toRecentlyViewedPropertyDto(List<RecentlyViewedProperty>recentlyViewedPropertyList);
    RecentlyViewedProperty toRecentlyViewedProperty(RecentlyViewedPropertyRequest recentlyViewedPropertyRequest);

}
