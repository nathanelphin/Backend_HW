package edu.kh.istad.b02m2restapi.service.impl;

import edu.kh.istad.b02m2restapi.model.User;
import edu.kh.istad.b02m2restapi.repository.UserRepository;
import edu.kh.istad.b02m2restapi.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;



@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }

    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElseThrow();
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
