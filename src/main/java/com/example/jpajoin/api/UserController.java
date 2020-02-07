package com.example.jpajoin.api;

import com.example.jpajoin.domain.User;
import com.example.jpajoin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@Transactional
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    private List<User> getAll() {
        return userRepository.findAll();
    }
}
