package com.ChatRoomProject;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ChatRoomProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(ChatRoomProject1Application.class, args);
		

	}

}
