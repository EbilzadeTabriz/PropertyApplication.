package www.Property.property.dto.respnseRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PropertyTypeRequest {

    @NotBlank(message = "Name is demanded")
    private String name;
    @NotBlank(message = "Description is needed")

    private String description;
    @NotBlank(message = "Image is needed")
    private String image;

}
