package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.type.TrueFalseConverter;

import java.time.LocalDate;

@Data
public class RecentlyViewedPropertyRequest {

    private LocalDate viewedAt;

}
