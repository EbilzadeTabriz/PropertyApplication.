package www.Property.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.PropertyImage;


@Repository
public interface PropertyImageRepository extends JpaRepository<PropertyImage,Long> {

}
