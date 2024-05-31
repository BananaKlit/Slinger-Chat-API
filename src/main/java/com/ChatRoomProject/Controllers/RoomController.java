package com.ChatRoomProject.Controllers;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ChatRoomProject.Model.Room;
import com.ChatRoomProject.Services.RoomService;
@CrossOrigin(origins = "*")
@RestController
public class RoomController {
	@Autowired
	private RoomService roomService;
	@CrossOrigin(origins = "*")
	@GetMapping("/Rooms/{id}")
	public List<Room> getChatRooms(@PathVariable String id) {
	    ObjectId objectId = new ObjectId(id);
	    List<Room> userRooms = roomService.findCurrentUserRooms(objectId);
	    System.out.println("User Rooms: " + userRooms + " (ID: " + objectId + ")");
	    return userRooms;
	}

}
