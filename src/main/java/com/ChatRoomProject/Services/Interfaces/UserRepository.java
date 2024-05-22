package com.ChatRoomProject.Services.Interfaces;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.ChatRoomProject.Model.User;

public interface UserRepository extends MongoRepository<User,ObjectId> {
		
	User findByUsername(String username);
	
}


