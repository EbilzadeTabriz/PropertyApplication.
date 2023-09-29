package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Property1Response {
    private Long id;
    private String title;
    private double price;

    private String contactInformation;

    private String city;

    private String distirict;
}
