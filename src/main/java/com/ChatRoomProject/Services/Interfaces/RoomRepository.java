package com.ChatRoomProject.Services.Interfaces;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ChatRoomProject.Model.Room;



public interface RoomRepository extends MongoRepository<Room, ObjectId> {

		List<Room> findByOwnerId(ObjectId Id);
		
		List<Room> findAll();

}
