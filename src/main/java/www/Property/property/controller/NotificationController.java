package www.Property.property.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.NotificationDto;
import www.Property.property.entity.Notification;
import www.Property.property.manager.NotifiicationImple;

import java.util.List;

@RestController
@Component
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotifiicationImple notifiicationImple;
    Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @GetMapping
    public List<NotificationDto> getAllNotification() {
        logger.info("done");
        return notifiicationImple.getAllNotification();
    }

    @GetMapping("/{notificationId}")

    public NotificationDto getByNotificationId(@PathVariable Long notificationId) {
        logger.info("got");
      return   notifiicationImple.getByNotificationId(notificationId);

    }

    @DeleteMapping("/{notificationId}")
    public void deleteByNotificationId(@PathVariable Long notificationId) {
        logger.info("deleted");
        notifiicationImple.deleteByNotificationId(notificationId);

    }

    @DeleteMapping
    public void deleteAllNotification() {
        logger.info("deleted all");
        notifiicationImple.deleteAllNotification();

    }

    @PostMapping("/{notification}")
    public void saveNotification(@RequestBody @Valid Notification notification) {
        logger.info("saved");
        notifiicationImple.saveNotification(notification);

    }

    @PutMapping("/{notificationId}")
    public void updateAllNotification(@PathVariable Long notificationId,@RequestBody Notification notification) {
        logger.info("updated");
        notifiicationImple.updateAllNotification(notificationId, notification);

    }
}
