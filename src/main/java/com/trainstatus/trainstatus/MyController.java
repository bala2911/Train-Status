package com.trainstatus.trainstatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class MyController {

    @Autowired
    UserService userService;

    @Autowired
    CreateUserResponseDTO createUserResponseDTO;

    @Autowired
    UserRepository userRepository;

    public String getData() {
        return "This is a GET request response from the server!";
    }

    @PostMapping
    public ResponseEntity<CreateUserResponseDTO> createUser(@RequestBody UserSchema user) {
        UserSchema createdUser = userRepository.save(user);

        // Convert the created UserSchema to CreateUserResponseDTO
        CreateUserResponseDTO responseDTO = new CreateUserResponseDTO(
                createdUser.getId(),
                createdUser.getUsername(),
                createdUser.getEmail()
        );

        // Return the DTO in the response with a 201 status code
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}
