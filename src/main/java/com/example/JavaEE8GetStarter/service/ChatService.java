package com.example.JavaEE8GetStarter.service;

import com.example.JavaEE8GetStarter.interceptor.Audited;

public class ChatService {
    @Audited
    public String deliverMessage(String msg) { return  msg;}
}
