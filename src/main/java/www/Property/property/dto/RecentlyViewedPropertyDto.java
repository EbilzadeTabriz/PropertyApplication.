package www.Property.property.dto;

import java.time.LocalDate;

public record RecentlyViewedPropertyDto(
        LocalDate viewedAt
) {
}
