package www.Property.property.dto;

import java.time.LocalDate;

public record NotificationDto(
        LocalDate sentAt,
        String message
) {
}
