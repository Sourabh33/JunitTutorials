package com.example.junit4;

public class BasicExample {

    private String message;

    public BasicExample(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
