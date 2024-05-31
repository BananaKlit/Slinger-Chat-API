package com.ChatRoomProject.Model;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Saloon")
public class Saloon {
	@Id
	private ObjectId id;
	private ObjectId roomId;
	private String type;
	private String name;
	private List<User> users;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getRoomId() {
		return roomId;
	}
	public void setRoomId(ObjectId roomId) {
		this.roomId = roomId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}