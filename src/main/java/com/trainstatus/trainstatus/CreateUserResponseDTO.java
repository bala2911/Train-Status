package com.trainstatus.trainstatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
public class CreateUserResponseDTO {
    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    public CreateUserResponseDTO() {
        // Default constructor
    }

    public CreateUserResponseDTO(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // Getters and setters (or use Lombok annotations to generate them)
}
