package edu.kh.istad.b02m2restapi.service;


import edu.kh.istad.b02m2restapi.dto.UserResponseDTO;
import edu.kh.istad.b02m2restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserServices {

    List<UserResponseDTO> getAll();

    UserResponseDTO getById(UUID id);

    User deleteById(UUID id);

    User insert(User user);
}
