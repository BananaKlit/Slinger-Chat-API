package com.ChatRoomProject.Model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Messages")
public class Message {

	  @Id
	    private ObjectId id;
	    private ObjectId chatroomId;
	    private ObjectId userId;
	    private String message;
		private String timestamp;



	    public Message() {}

	    public Message(ObjectId id, ObjectId chatroomId, ObjectId userId, String message, String timestamp) {
	        this.id = id;
	        this.chatroomId = chatroomId;
	        this.userId = userId;
	        this.message = message;
	        this.timestamp = timestamp;
	    }

	    public ObjectId getId() {
	        return id;
	    }

	    public void setId(ObjectId id) {
	        this.id = id;
	    }

	    public ObjectId getChatroomId() {
	        return chatroomId;
	    }

	    public void setChatroomId(ObjectId chatroomId) {
	        this.chatroomId = chatroomId;
	    }

	    public ObjectId getUserId() {
	        return userId;
	    }

	    public void setSenderId(ObjectId userId) {
	        this.userId = userId;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public String getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(String timestamp) {
	        this.timestamp = timestamp;
	    }
}
