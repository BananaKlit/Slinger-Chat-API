package com.ChatRoomProject.DataAccess;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.ChatRoomProject.Model.Message;

public interface MessageRepository extends MongoRepository<Message,ObjectId> {
}