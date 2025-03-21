package com.example.DevOps;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class WebService {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car listOfCars() {
        return new Car("Toyota", "2344555", "5467.99");
    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        return new Car("mark");
    }
}
