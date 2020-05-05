package com.sparta.crss.manager;

import java.util.logging.Logger;

public class LoggingExample {

    private String message;
    private Logger log = Logger.getLogger(LoggingExample.class.getName());

    public String getMessage() {
        return message;
    }

//    public void setMessage(String message) {
//        this.message = message;
//        log.trace("Message set");
//    }
//
//    public void displayMessage() {
//        System.out.println(message);
//        log.debug("Message printed - " + message);
//    }

    public void deleteMessage() {

    }
}
