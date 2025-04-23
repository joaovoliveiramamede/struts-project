package com.example.struts.action;

import com.example.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        helloCount++;
        return SUCCESS;
    }

    public int getHelloCount() {
        return helloCount;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


}