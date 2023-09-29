package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
@RequiredArgsConstructor
@Data
public class UserResponse {
    private Long id;
    private String userFullName;
    private String password;
    private String email;
    private Integer phoneNumber;

    private Date birthInformation;
}
