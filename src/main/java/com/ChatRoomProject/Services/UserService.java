
package com.ChatRoomProject.Services;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.ChatRoomProject.Model.User;
import com.ChatRoomProject.Model.DTO.UserDTO;
import com.ChatRoomProject.Services.Interfaces.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String login(UserDTO userObj) {
        User existingUser = userRepo.findByUsername(userObj.getUsername());
        if (existingUser != null && existingUser.getPassword().equals(userObj.getPassword())) {
            ObjectId userId = existingUser.getId();
            return userId.toString();
        } else {
            return null;
        }
    }
}
