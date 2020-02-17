package edu.cursor.web.dto;

import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;

    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
