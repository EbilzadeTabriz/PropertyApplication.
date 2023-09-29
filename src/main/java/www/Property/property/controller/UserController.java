package www.Property.property.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import www.Property.property.dto.RegisterRequest;
import www.Property.property.dto.UserDto;
import www.Property.property.dto.respnseRequest.UserRequest;
import www.Property.property.entity.User;
import www.Property.property.manager.UserImple;

import java.util.List;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping(("/users"))
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserImple userImple;

    @GetMapping
    public List<UserDto> getAll() {
        logger.info("done");
        return userImple.getAll();

    }

    @GetMapping("/{id}")
    public UserDto getByUserId(@PathVariable Long id) {
        logger.info("got");
        return userImple.getByUserId(id);

    }

    @DeleteMapping("/{id}")
    public void deleteBYUserId(@PathVariable Long id) {
        logger.info("deleted");
        userImple.deleteBYUserId(id);
    }

    @DeleteMapping
    public void deleteAll() {
        logger.info("deleted all");
        userImple.deleteAll();
    }

    @PostMapping("/{userRequest}")
    public ResponseEntity<Void> saveUser(@RequestBody @Valid UserRequest userRequest) {
        userImple.saveUser(userRequest);
        logger.info("saved");
        return new ResponseEntity<>(HttpStatus.CREATED);


    }


    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        userImple.updateUser(id, user);


    }

    @GetMapping("/{email}")
    public UserDto getUserByEmail(@RequestBody String email) {
        return userImple.getUserByEmail(email);

    }


@PostMapping("/{user}")
@ResponseStatus(code = HttpStatus.CREATED)
   public ResponseEntity<Void> register(@RequestBody @Valid RegisterRequest registerRequest) {
        userImple.register(registerRequest);
    logger.info("registered");
    return new ResponseEntity<>(HttpStatus.CREATED);

}
}


