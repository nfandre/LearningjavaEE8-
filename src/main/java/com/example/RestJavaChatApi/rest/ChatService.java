package com.example.RestJavaChatApi.rest;

import java.util.*;

public class ChatService {
    private static final Map<String, List<String>> messages = new HashMap<>();

    public String getLastMessage(String userId) {
        return Optional.ofNullable(messages.get(userId))
                .filter(v -> v.size() > 0)
                .map(v -> v.get(v.size() -1))
                .orElse("");
    }

    public void sendMessageTo(String userId, String message) {
        List<String> m = messages.getOrDefault(userId, new LinkedList<>());
        m.add(message);
        messages.put(userId, m);
    }
}
