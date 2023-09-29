package www.Property.property.dto.respnseRequest;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class RecentlyViewedPropertyResponse {
    private Long RecentlyViewedPropertyId;
    private LocalDate viewedAt;


}
