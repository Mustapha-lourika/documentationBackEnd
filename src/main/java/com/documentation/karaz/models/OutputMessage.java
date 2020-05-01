package com.documentation.karaz.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;

import com.documentation.karaz.repository.UserRepository;

@Entity
public class OutputMessage {
    @Autowired
    @Transient
    private UserRepository userRepository;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long                   id_message;
    @NotEmpty
    private String         messageoutpu;

    private String         source;
    private Date           date;

    public Long getId_message() {
        return id_message;
    }

    public OutputMessage() {
        // TODO Auto-generated constructor stub
    }

    public OutputMessage( Long id_message, String messageoutpu, String source, Date date ) {
        super();
        this.id_message = id_message;
        this.messageoutpu = messageoutpu;
        this.date = date;
        this.source = source;
    }

    public OutputMessage( String source, String messageoutput, Date date ) {
        super();
        this.messageoutpu = messageoutput;

        this.source = source;
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource( String source ) {
        this.source = source;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public String getMessageoutpu() {
        return messageoutpu;
    }

    public void setMessageoutput( String messageoutput ) {
        this.messageoutpu = messageoutput;
    }

}