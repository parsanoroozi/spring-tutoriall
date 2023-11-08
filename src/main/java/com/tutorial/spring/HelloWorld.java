package com.tutorial.spring;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld", eager = true)
@SessionScoped
public class HelloWorld {
    private String  message;

    public String getMessage() {
        System.out.println("Your Message : " + this.message);
        return "Your Message : " + this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        System.out.println("bean is initiating");
    }
    public void destroy(){
        System.out.println("Bean is about to destroy");
    }
}
