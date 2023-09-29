package www.Property.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.Property1;


//Property sehvlik var
@Repository
public interface Property1Repository extends JpaRepository<Property1,Long> {

}
