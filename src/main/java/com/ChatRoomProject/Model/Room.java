package com.ChatRoomProject.Model;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rooms")
public class Room {
	  @Id				
	private ObjectId id;
	private List<User> members;
	private String image;
//	private List<Saloon>saloons;  
	private ObjectId ownerId;
	
	
	
	public Room(ObjectId id, List<User> members, String image, ObjectId ownerId) {
		super();
		this.id = id;
		this.members = members;
		this.image = image;
		this.ownerId = ownerId;
	}
	public ObjectId getId() {
		return this.id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public List<User> getMembers() {
		return this.members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}
//	public List<Saloon> getSaloons() {
//		return saloons;
//	}
//	public void setSaloons(List<Saloon> saloons) {
//		this.saloons = saloons;
//	}
	public ObjectId getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(ObjectId ownerId) {
		this.ownerId = ownerId;
	}
	
}
	