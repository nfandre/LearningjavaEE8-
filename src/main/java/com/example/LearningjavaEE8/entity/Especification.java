package com.example.LearningjavaEE8.entity;

import com.example.LearningjavaEE8.entity.Color;
import com.example.LearningjavaEE8.entity.EngineType;

public class Especification {
    private final Color color;
    private final EngineType engineType;

    public Especification(Color color, EngineType engineType) {
        this.color = color;
        this.engineType = engineType;
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
