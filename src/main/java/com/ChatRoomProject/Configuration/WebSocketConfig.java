package com.ChatRoomProject.Configuration;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import com.ChatRoomProject.Controllers.WsController;
import com.ChatRoomProject.Model.Room;
import com.ChatRoomProject.Model.Saloon;
import com.ChatRoomProject.Services.RoomService;
import com.ChatRoomProject.Services.Interfaces.SaloonRepository;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

   
//    private final Authentication authentication;
    private final RoomService roomService;
    private final SaloonRepository saloonRepo;
    public WebSocketConfig(RoomService chatService,SaloonRepository saloonrepo) {
    	this.saloonRepo=saloonrepo;
        this.roomService = chatService;
//        this.authentication = SecurityContextHolder.getContext().getAuthentication();
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        if (authentication != null && authentication.isAuthenticated()) {
//            ObjectId userId = ((User) authentication.getPrincipal()).getId();
    		ObjectId userId=new ObjectId("65ce2c728c69194ce585038b");
            List<Room> UserRooms=roomService.findCurrentUserRooms(userId);
            System.out.println("rooms:"+UserRooms);
            for (Room room: UserRooms) {
                List<Saloon> saloons = saloonRepo.findByRoomId(room.getId());
                System.out.println(saloons);
                for (Saloon saloon : saloons) {
                	   System.out.println(saloon.getId().toString());
                    registry.addHandler(new WsController(), "/ws/" + saloon.getId()).setAllowedOrigins("*");
                }
            	
            }
     
        }
//    }
}
