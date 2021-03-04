package com.example.LearningjavaEE8.control;

import com.example.LearningjavaEE8.entity.CarCreated;

import javax.enterprise.event.Observes;

public class CarCreationListener {
    public void  onCarCreation(@Observes CarCreated carCreated){
        System.out.println("New car was created with id: " + carCreated.getIdentifier());
    }
}
