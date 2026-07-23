package com.example.springcore;

public class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        String msgContent = "Email notification has been sent out successfully!";
        System.out.println(msgContent);
    }

}