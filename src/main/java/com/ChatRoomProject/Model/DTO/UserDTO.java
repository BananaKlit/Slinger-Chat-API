package com.ChatRoomProject.Model.DTO;

public class UserDTO {
	
	 	private String username;
	    private String password;
	    private String email;
	    private String role;
	    
	    public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    public String getRole() {
			return role;
		}
		public void setRoles(String role) {
			this.role = role;
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