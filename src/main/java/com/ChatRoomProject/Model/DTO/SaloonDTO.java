package com.ChatRoomProject.Model.DTO;

import org.bson.types.ObjectId;

import com.ChatRoomProject.Model.Message;
import com.ChatRoomProject.Model.User;

public class SaloonDTO {
	public ObjectId getId() {
		return Id;
	}
	public void setId(ObjectId id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Message[] getMessages() {
		return Messages;
	}
	public void setMessages(Message[] messages) {
		Messages = messages;
	}
	public User[] getUsers() {
		return Users;
	}
	public void setUsers(User[] users) {
		Users = users;
	}
	private ObjectId Id;
	 private String Name;
	 private Message []Messages;
	 private User[]Users;


}
