package com.ChatRoomProject.Services.Interfaces;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ChatRoomProject.Model.Saloon;

public interface SaloonRepository extends MongoRepository<Saloon,ObjectId > {
	List<Saloon>findByRoomId(ObjectId roomId);
	List<Saloon>findAll();
		 Saloon findByid(ObjectId saloonId);
}
