package com.example.LearningjavaEE8.entity;

public class Car {
    private String indetifier;
    private Color color;
    private EngineType engineType;

    public String getIndetifier() {
        return indetifier;
    }

    public void setIndetifier(String indetifier) {
        this.indetifier = indetifier;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
