package com.ChatRoomProject.DataAccess;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChatRoomProject.Model.User;
import com.ChatRoomProject.Model.UserDTO;

@RestController
public class LoginController {
  
    private final UserRepository userRepo;

    public LoginController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public ResponseEntity<User> 
    login(@RequestBody UserDTO userObj) {
    	
        User existingUser =  userRepo.findByUsername(userObj.getUsername());
        
        if(existingUser != null && existingUser.getPassword().equals(userObj.getPassword())) {
        	return ResponseEntity.ok(existingUser);
        }else {
        	return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
        }

      
    }
}
