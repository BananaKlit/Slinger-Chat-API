package com.ChatRoomProject.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ChatRoomProject.Model.Message;
import com.ChatRoomProject.Services.Interfaces.MessageRepository;

@RestController
@RequestMapping("/Messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;


    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        // Save the message to the repository
        Message savedMessage = messageRepository.save(message);

        // Broadcast the message to all clients

        return savedMessage;
    }
    @GetMapping
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
