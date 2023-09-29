package www.Property.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.RecentlyViewedProperty;

@Repository

public interface RecentlyViewedPropertyRepository extends JpaRepository< RecentlyViewedProperty,Long> {
}
