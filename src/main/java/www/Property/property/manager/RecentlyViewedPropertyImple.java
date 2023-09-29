package www.Property.property.manager;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import www.Property.property.dto.RecentlyViewedPropertyDto;
import www.Property.property.dto.respnseRequest.RecentlyViewedPropertyRequest;
import www.Property.property.entity.RecentlyViewedProperty;
import www.Property.property.mapper.RecentlyViewedPropertyMapper;
import www.Property.property.repository.RecentlyViewedPropertyRepository;
import www.Property.property.service.RecentlyViewedPropertyService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecentlyViewedPropertyImple implements RecentlyViewedPropertyService {
    private final RecentlyViewedPropertyRepository recentlyViewedRepository;
    private final RecentlyViewedPropertyMapper recentlyViewedPropertyMapper;
    @Override
    public List<RecentlyViewedPropertyDto> getAllView() {
        return recentlyViewedRepository
                .findAll()
                .stream()
                .map(recentlyViewedPropertyMapper::toRecentlyViewedPropertyDto)
                .toList();
    }

    @Override
    public void saveViews(RecentlyViewedPropertyRequest recentlyViewedProperty) {
        recentlyViewedRepository.save(recentlyViewedPropertyMapper.toRecentlyViewedProperty(recentlyViewedProperty));

    }

    @Override
    public void updateViews(Long recentlyViewedId, RecentlyViewedProperty recentlyViewedProperty) {
        RecentlyViewedProperty updated = recentlyViewedRepository.findById(recentlyViewedId).get();
        updated.setViewedAt(recentlyViewedProperty.getViewedAt());
        updated.setRecentlyViewedPropertyId(recentlyViewedProperty.getRecentlyViewedPropertyId());

        recentlyViewedRepository.save(updated);
    }

    @Override
    public void deleteAll() {
        recentlyViewedRepository.deleteAll();

    }

    @Override
    public void deleteViewsById(Long recentlyViewedId) {
        recentlyViewedRepository.deleteById(recentlyViewedId);

    }
}
