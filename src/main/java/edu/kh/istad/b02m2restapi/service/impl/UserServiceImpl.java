package edu.kh.istad.b02m2restapi.service.impl;

import edu.kh.istad.b02m2restapi.dto.UserResponseDTO;
import edu.kh.istad.b02m2restapi.model.User;
import edu.kh.istad.b02m2restapi.repository.UserRepository;
import edu.kh.istad.b02m2restapi.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public List<UserResponseDTO> getAll() {


        List<UserResponseDTO> responseDTO = new ArrayList<>();

        for (User user:userRepository.selectAll()){

            UserResponseDTO response = new UserResponseDTO();

            response.setId(user.getId());
            response.setName(user.getName());
            response.setUsername(user.getUsername());

            responseDTO.add(response);
        }

        return responseDTO;
    }

    @Override
    public UserResponseDTO getById(UUID id) {
        User user = userRepository.selectById(id)
                .orElseThrow();

        UserResponseDTO responseDTO = new UserResponseDTO();

        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        responseDTO.setUsername(user.getUsername());

        return responseDTO;
    }

    @Override
    public User deleteById(UUID id) {
        User user = userRepository.selectById(id)
                .orElseThrow();
        userRepository.delete(id);
        return user;
    }

    @Override
    public User insert(User user) {
        userRepository.insert(user);
        return user;
    }
}
