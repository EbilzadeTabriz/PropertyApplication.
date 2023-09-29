package www.Property.property.service;

import www.Property.property.dto.NotificationDto;
import www.Property.property.entity.Notification;

import java.util.List;

public interface NotificationService {
    public List<NotificationDto> getAllNotification();
   NotificationDto getByNotificationId(Long notificationId);
    void deleteByNotificationId(Long notificationId);
    void deleteAllNotification();
    void saveNotification(Notification notification);
    void updateAllNotification(Long notificationId,Notification notification);



}
