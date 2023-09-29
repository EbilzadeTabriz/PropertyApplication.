package www.Property.property.manager;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import www.Property.property.dto.RegisterRequest;
import www.Property.property.dto.UserDto;
import www.Property.property.dto.respnseRequest.UserRequest;
import www.Property.property.entity.User;
import www.Property.property.exception.UserNotFoundException;
import www.Property.property.mapper.UserMapper;
import www.Property.property.repository.UserRepository;
import www.Property.property.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserImple implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
//    sorus niye Long oldu
    public List<UserDto> getAll() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::toUserDto).
                toList();

    }

    @Override
    public UserDto getByUserId(Long id) {
        return userRepository
                .findById(id)
                .stream()
                .map(userMapper::toUserDto)
                .findFirst()
                .orElseThrow(()->new UserNotFoundException("User not found with ID: " + id));
    }

    @Override
    public void deleteBYUserId(Long id) {
        userRepository.deleteById(id);
        if (id == 0) {
            System.out.println("okay");
        }else {
            System.out.println(false);
        }

    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public void updateUser(Long id, User user) {
        User updated = userRepository.findById(id).get();
        updated.setId(user.getId());
        updated.setPassword(user.getPassword());
        updated.setRole(user.getRole());
        updated.setEmail(user.getEmail());
        updated.setUserFullName(user.getUserFullName());
        updated.setBirthInformation(user.getBirthInformation());
        updated.setIsActive(user.getIsActive());
        updated.setPhoneNumber(user.getPhoneNumber());






    }

    @Override
    public void saveUser(UserRequest user) {

        userRepository.save(userMapper.toUser(user));


    }

    @Override
    public UserDto getUserByEmail(String email) {
        return userRepository.findUserByEmail(email).stream().map(userMapper::toUserDto).findFirst().orElseThrow(()->new UserNotFoundException("User not found with email: " + email));
    }



    public void register(RegisterRequest registerRequest) {
        User user = userMapper.toUser(registerRequest);
        user.setPassword(passwordEncoder.encode(registerRequest.password()));
      userRepository.save(user);
   }


}
