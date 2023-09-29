package www.Property.property.dto;

import www.Property.property.entity.Role;

import java.util.Date;

public record UserDto(String userFullName,
                      String password,
                      String email,
                      Integer phoneNumber,
                      Date birthInformation,
                      Boolean isActive,
                      Role role) {



}
