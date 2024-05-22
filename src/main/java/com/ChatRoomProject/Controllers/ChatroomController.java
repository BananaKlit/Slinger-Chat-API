package com.ChatRoomProject.Controllers;

//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.ChatRoomProject.Model.ChatRoom;
//import com.ChatRoomProject.Services.Interfaces.ChatroomRepository;
//@RestController
//public class ChatroomController {
//	@Autowired
//	private ChatroomRepository chatroomRepo;
//	
//	public ChatroomController(ChatroomRepository Crepo) {
//		this.chatroomRepo=Crepo;
//	}
//	@CrossOrigin(origins = "http://localhost:3000")
//	@PostMapping("/Room")
//	public ChatRoom createChatRoom(@RequestBody ChatRoom room) {
//		return chatroomRepo.save(room);
//	}
//
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("/Rooms")
//	public List<ChatRoom> getChatRooms() {
//		return chatroomRepo.findAll();
//	}
//
//
//
//}
