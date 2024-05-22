package com.ChatRoomProject.Model;

import org.bson.types.ObjectId;

public class Saloon {
	private ObjectId Id;
	 private String Name;
	 private Message []Messages;
	 private User[]Users;
	 public Saloon(ObjectId id, String name, Message[] messages, User[] users) {
		super();
		Id = id;
		Name = name;
		Messages = messages;
		Users = users;
	}


}
