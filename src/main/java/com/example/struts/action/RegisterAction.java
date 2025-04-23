package com.example.struts.action;

import com.example.struts.model.request.PersonRequest;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }
}