package com.nonder.soapservice;

import com.nonder.Car;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

@Component
public class CarService {

    Map<String, Car> cars;
    final CarFactory carFactory;

    public CarService(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @PostConstruct
    public void initData() {
        this.cars = carFactory.createInitialData();
    }

    public Car findCar(String name) {
        return cars.get(name.toUpperCase());
    }
}