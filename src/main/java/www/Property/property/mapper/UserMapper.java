package www.Property.property.mapper;

import org.mapstruct.Mapper;
import www.Property.property.dto.RegisterRequest;
import www.Property.property.dto.UserDto;
import www.Property.property.dto.respnseRequest.UserRequest;
import www.Property.property.entity.User;
import www.Property.property.security.MyUserDetails;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);

    User toUser(UserDto userDto);

    List<UserDto> toUserDto(List<User> userList);

    User toUser(UserRequest userRequest);
    User toUser(RegisterRequest registerRequest);

   MyUserDetails toMyUserDetails(UserDto user);
}
