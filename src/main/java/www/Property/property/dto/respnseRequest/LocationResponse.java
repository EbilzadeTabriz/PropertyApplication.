package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LocationResponse {
    private Long locationId;

    private String district;

    private String city;

    private String neighborhood;

}
