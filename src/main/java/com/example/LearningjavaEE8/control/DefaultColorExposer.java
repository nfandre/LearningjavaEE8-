package com.example.LearningjavaEE8.control;

import com.example.LearningjavaEE8.entity.Color;

import javax.enterprise.inject.Produces;

public class DefaultColorExposer {

    @Produces
    @Diesel
    public Color exposeColorDefault(){
        return Color.BLACK;
    }
}
