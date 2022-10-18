package com.dto;

import com.model.Role;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.model.AppUser} entity
 */
@Data
public class AppUserDto implements Serializable {
    private final Integer userId;
    private final String firstName;
    private final String lastName;
    private final Role role;
    private final String address;
    private final String userName;
    private final String passWord;
}