package com.example.LearningjavaEE8.boundary;

import com.example.LearningjavaEE8.entity.Car;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarsResource {
    @Inject
    CarManufacturer carManufacturer;

    @GET
    public List<Car> retrieveCars() {
        return carManufacturer.retrivesCars();
    }
}
