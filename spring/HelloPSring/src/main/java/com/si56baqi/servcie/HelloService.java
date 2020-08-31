package com.si56baqi.servcie;

public class HelloService {
    private String message;

    public String getMessage() {
        System.out.println(message);
        return message;

    }

    public void setMessage(String message) {
        this.message = message;
    }
}
