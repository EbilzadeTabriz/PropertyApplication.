package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.NotificationDto;
import www.Property.property.entity.Notification;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper  {
    NotificationDto toNotificationDto(Notification notification);
    Notification toNotification(NotificationDto notificationDto);
    List<NotificationDto> toNotificationDto(List<Notification> notificationList);
}
