package com.ChatRoomProject.Services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.ChatRoomProject.Model.Room;
import com.ChatRoomProject.Services.Interfaces.RoomRepository;



@Service
public class RoomService {

    private final RoomRepository chatroomRepository;

    public RoomService(RoomRepository chatroomRepository) {
        this.chatroomRepository = chatroomRepository;
    }


	public List<Room> findCurrentUserRooms (ObjectId OwnerId) {
		List<Room> rooms= chatroomRepository.findByOwnerId(OwnerId);
		return rooms;
		
	}
    
    
}
