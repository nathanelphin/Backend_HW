package edu.kh.istad.b02m2restapi.dto;

import edu.kh.istad.b02m2restapi.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Setter
public class UserResponseDTO {

    private @Getter UUID id;
    private @Getter String name;
    private @Getter String username;

}