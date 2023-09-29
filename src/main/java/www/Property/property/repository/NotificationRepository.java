package www.Property.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.Property.property.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
