package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PropertyTypeResponse {
    private Long propertyTypeId;

    private String name;

    private String description;

    private String image;

}
