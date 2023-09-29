package www.Property.property.service;

import www.Property.property.dto.RecentlyViewedPropertyDto;
import www.Property.property.dto.UserDto;
import www.Property.property.dto.respnseRequest.RecentlyViewedPropertyRequest;
import www.Property.property.entity.RecentlyViewedProperty;

import java.util.List;

public interface RecentlyViewedPropertyService {
    public List<RecentlyViewedPropertyDto> getAllView();
    void saveViews(RecentlyViewedPropertyRequest recentlyViewedPropertyRequest);
    void updateViews(Long recentlyViewedId,RecentlyViewedProperty recentlyViewedProperty );
    void deleteAll();
    void deleteViewsById(Long recentlyViewedId );
}
