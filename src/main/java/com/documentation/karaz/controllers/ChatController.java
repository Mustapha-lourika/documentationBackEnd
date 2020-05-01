package com.documentation.karaz.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.documentation.karaz.models.MessageInput;
import com.documentation.karaz.models.OutputMessage;
import com.documentation.karaz.repository.OutputMessageRepository;

@CrossOrigin( )
@RestController
public class ChatController {
    @Autowired
    OutputMessageRepository outpumessagerepo;

    @MessageMapping( "/hello" )
    @SendTo( "/topic/greetings" )
    public OutputMessage greeting( MessageInput messageInput ) throws Exception {

        Date time = new Date();
        OutputMessage outputMessage = new OutputMessage( messageInput.getUser(), messageInput.getContent(), time );
        outpumessagerepo.save( outputMessage );
        return outputMessage;
    }

    @GetMapping( value = "/getMessage", produces = "application/json" )
    public List<OutputMessage> getAllMessage() {
        return outpumessagerepo.findAll();
    }

}