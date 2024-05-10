package com.example.redisproject.controller;

import com.example.redisproject.model.Car;
import com.example.redisproject.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("{id}")
    public Car getCar(@PathVariable("id") Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("")
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @PostMapping("/create")
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car.getCompany(), car.getModel());
    }
}
