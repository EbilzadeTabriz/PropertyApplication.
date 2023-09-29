package www.Property.property.service;

import www.Property.property.dto.UserDto;
import www.Property.property.dto.respnseRequest.UserRequest;
import www.Property.property.entity.User;

import java.util.List;

public interface UserService {
    public List<UserDto> getAll();

    UserDto getByUserId(Long id);

    void deleteBYUserId(Long id);

    void deleteAll();

    void updateUser(Long Id, User user);

    void saveUser(UserRequest userRequest);

    UserDto getUserByEmail(String email);

//    void  register(User user);


}
