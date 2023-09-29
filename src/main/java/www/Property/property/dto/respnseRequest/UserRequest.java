package www.Property.property.dto.respnseRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.Date;

@Data
public class UserRequest {
    @NotBlank(message = "Full name should be added")
    private String userFullName;
    @NotBlank(message = "You can't ignore password")
    private String password;
    @NotEmpty(message = "Email must be added")
    private String email;
    @NotEmpty(message = "Phone number can't be empty")
    private Integer phoneNumber;
    @NotEmpty(message ="You need to add")

    private Date birthInformation;
}
