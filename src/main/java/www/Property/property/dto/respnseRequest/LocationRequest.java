package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LocationRequest {
    @NotBlank(message = "must be added")
    private String district;
    @NotBlank(message = "must be added")
    private String city;
    @NotBlank(message = "must be added")
    private String neighborhood;
}
