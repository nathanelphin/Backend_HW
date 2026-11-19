package edu.kh.istad.b02m2restapi.controller;

import edu.kh.istad.b02m2restapi.dto.UserResponseDTO;
import edu.kh.istad.b02m2restapi.model.User;
import edu.kh.istad.b02m2restapi.repository.UserRepository;
import edu.kh.istad.b02m2restapi.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor

public class UserController {

    private final UserServices userService;

    @GetMapping
    public List<UserResponseDTO> getAll() {
        return userService.getAll();
    }


    @GetMapping("/{id}")
    public UserResponseDTO getById(@PathVariable UUID id) {

        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public User deleteById(@PathVariable UUID id) {
        return userService.deleteById(id);
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userService.insert(user);
    }

}
