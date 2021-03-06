package com.sparta.crss.exceptions;

public class SorterException extends Exception {

    private String message;

    public SorterException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}