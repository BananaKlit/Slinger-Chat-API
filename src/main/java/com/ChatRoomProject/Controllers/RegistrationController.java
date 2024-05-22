package com.ChatRoomProject.Controllers;

import com.ChatRoomProject.Model.User;
import com.ChatRoomProject.Model.DTO.UserDTO;
import com.ChatRoomProject.Services.Interfaces.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final UserRepository userRepository;

    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/register")
    public void register(@RequestBody UserDTO request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        userRepository.save(user);
    }

}
