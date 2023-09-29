package www.Property.property.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import www.Property.property.dto.NotificationDto;
import www.Property.property.entity.Notification;
import www.Property.property.exception.NotificationNotFound;
import www.Property.property.mapper.NotificationMapper;
import www.Property.property.repository.NotificationRepository;
import www.Property.property.service.NotificationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotifiicationImple implements NotificationService {
    private final NotificationRepository notificationRepository;
    private  final NotificationMapper notificationMapper;
    @Override
    public List<NotificationDto> getAllNotification() {
        return notificationRepository
                .findAll()
                .stream()
                .map(notificationMapper::toNotificationDto)
                .toList();
    }

    @Override
    public NotificationDto getByNotificationId(Long notificationId) {
      return notificationRepository
                .findById(notificationId)
                .stream()
                .map(notificationMapper::toNotificationDto)
                .findFirst()
                .orElseThrow(()->new NotificationNotFound("Notification not found with ID:"  + notificationId));

    }

    @Override
    public void deleteByNotificationId(Long notificationId) {
         notificationRepository.deleteById(notificationId);

    }

    @Override
    public void deleteAllNotification() {
        notificationRepository.deleteAll();

    }

    @Override
    public void saveNotification(Notification notification) {
        notificationRepository.save(notification);

    }

    @Override
    public void updateAllNotification(Long notificationId, Notification notification) {
        Notification updated = notificationRepository.findById(notificationId).get();
        updated.setNotificationId(notification.getNotificationId());
        updated.setMessage(notification.getMessage());
        updated.setSentAt(notification.getSentAt());
notificationRepository.save(updated);
    }
}
