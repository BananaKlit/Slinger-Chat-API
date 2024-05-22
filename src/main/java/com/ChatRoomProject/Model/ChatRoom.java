package com.ChatRoomProject.Model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rooms")
public class ChatRoom {
	  @Id				
	private ObjectId ChatroomId;
	public ObjectId OwnerId;
	public User[] Members;

}