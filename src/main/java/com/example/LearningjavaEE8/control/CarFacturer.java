package com.example.LearningjavaEE8.control;

import com.example.LearningjavaEE8.boundary.Especification;
import com.example.LearningjavaEE8.entity.Car;
import com.example.LearningjavaEE8.entity.Color;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.UUID;

@Dependent
public class CarFacturer {
    @Inject
    @Diesel
    private Color defaultColor;

    public Car createCar(Especification especification) {
        Car car = new Car();
        car.setIndetifier(UUID.randomUUID().toString());
        car.setColor(especification.getColor() == null ? defaultColor : especification.getColor());
        car.setEngineType(especification.getEngineType());
        return car;
    }
}
