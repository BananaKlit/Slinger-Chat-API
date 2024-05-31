package com.ChatRoomProject.Model;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Messages")
public class Message {

	  @Id
	    private ObjectId Id;
	    private ObjectId ChatroomId;
	    private ObjectId UserId;
	    private String Message;
		private LocalDateTime Timestamp;

}
