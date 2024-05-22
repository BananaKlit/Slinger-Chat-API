package com.ChatRoomProject.Controllers;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ChatRoomProject.Model.User;
import com.ChatRoomProject.Model.DTO.UserDTO;
import com.ChatRoomProject.Services.Interfaces.UserRepository;

@RestController
public class UserController {
  
    private final UserRepository userRepo;
    public UserController(UserRepository userRepo) {
      this.userRepo = userRepo;
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<String>  
    login(@RequestBody UserDTO userObj) {
    	
        User existingUser =  userRepo.findByUsername(userObj.getUsername());
        
        if(existingUser != null && existingUser.getPassword().equals(userObj.getPassword())) {
            return ResponseEntity.ok(existingUser.getId().toString());
        } else {
        	return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
        }

      
    }
}
