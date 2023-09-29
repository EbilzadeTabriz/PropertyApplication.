package www.Property.property.repository;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}
