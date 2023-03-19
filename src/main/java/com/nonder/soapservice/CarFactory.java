package com.nonder.soapservice;

import com.nonder.BodyStyle;
import com.nonder.Car;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarFactory {
    public Map<String, Car>  createInitialData() {
        Map<String, Car> map = new HashMap();
        map.put("TOYOTA", createCar("Toyota", "Corolla", 1995, BodyStyle.SEDAN));
        map.put("VOLKSWAGEN", createCar("Volkswagen", "Passat", 2000, BodyStyle.SEDAN));
        map.put("MERCEDES", createCar("Mercedes", "A180", 2012, BodyStyle.HATCHBACK));
        map.put("AUDI", createCar("Audi", "Q3", 2014, BodyStyle.SUV));
        return map;
    }

    //auto-generated classes do not have a full constructor
    private Car createCar(String brand, String model, int modelYear, BodyStyle bodyStyle) {
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setModelYear( modelYear);
        car.setBodyStyle(bodyStyle);
        return car;
    }
}
