package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
public class Property1Request {
    @NotBlank(message = "Title is required")
    private String title;
    @Positive(message = "Price must be positive")
    private double price;
    @NotBlank(message = "Contact_Information is needed")
    private String contactInformation;
    @NotBlank(message = "Mention where property is")
    private String city;
    @NotBlank(message = "Show the district")
   private String distirict;
}
