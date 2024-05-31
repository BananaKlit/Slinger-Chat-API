package com.ChatRoomProject.Model;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

			@Id
	  	private ObjectId id;
	    private String username;
	    private String password;
		private List<String> role;
		private String email;
	
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    public ObjectId getId() {
			return id;
		}
		public void setId(ObjectId id) {
			this.id = id;
		}

		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
