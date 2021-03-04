package com.example.LearningjavaEE8.boundary;

import com.example.LearningjavaEE8.control.CarFacturer;
import com.example.LearningjavaEE8.control.CarRepository;
import com.example.LearningjavaEE8.entity.Car;
import com.example.LearningjavaEE8.entity.CarCreated;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
public class CarManufacturer {
    @Inject
    CarFacturer carFacturer;
    @Inject
    CarRepository carRepository;

    @Inject
    Event<CarCreated> carCreatedEvent;
    public Car manufsdtureCar(Especification especification) {
        Car car =  carFacturer.createCar(especification);
        carRepository.store(car);
        carCreatedEvent.fire(new CarCreated(car.getIndetifier()));
        return car;
    }


}
