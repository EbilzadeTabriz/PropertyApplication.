package www.Property.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.PropertyType;

import java.awt.*;
import java.util.Optional;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType,Long> {



}
