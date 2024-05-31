package com.ChatRoomProject.Controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.ChatRoomProject.Model.Saloon;
import com.ChatRoomProject.Services.Interfaces.SaloonRepository;

@CrossOrigin(origins = "*")
@RestController
public class SaloonController {
	@Autowired
	private SaloonRepository saloonRepo;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/Saloon/{id}")
	public List<Saloon> getSaloons(@PathVariable String id) {
	    ObjectId objectId = new ObjectId(id);
//	    List<Saloon> roomSaloons = saloonRepo.findAll();
	    List<Saloon> roomSaloons = saloonRepo.findByRoomId(objectId);
	    System.out.println("User Rooms: " + roomSaloons + " (ID: " + objectId + ")");
	    return roomSaloons;
	}

}
