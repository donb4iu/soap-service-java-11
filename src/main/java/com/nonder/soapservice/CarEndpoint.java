package com.nonder.soapservice;

import com.nonder.GetCarRequest;
import com.nonder.GetCarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarEndpoint {

    private static final String NAMESPACE_URI = "http://www.nonder.com";

    private CarService CarService;

    @Autowired
    public CarEndpoint(CarService CarService) {
        this.CarService = CarService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCar(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(CarService.findCar(request.getName()));

        return response;
    }
}