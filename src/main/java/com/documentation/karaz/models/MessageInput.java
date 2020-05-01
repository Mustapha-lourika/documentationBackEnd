package com.documentation.karaz.models;

public class MessageInput {
    private String user;

    private String content;

    public MessageInput() {
        // TODO Auto-generated constructor stub
    }

    public String getUser() {
        return user;
    }

    public void setUser( String user ) {
        this.user = user;
    }

    public MessageInput( String content, String user ) {
        this.content = content;
        this.user = user;

    }

    public String getContent() {
        return content;
    }

}
