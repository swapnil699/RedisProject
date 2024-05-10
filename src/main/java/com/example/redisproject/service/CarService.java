package com.example.redisproject.service;

import com.example.redisproject.model.Car;
import com.example.redisproject.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car createCar(String company, String model) {
        Car car = new Car();
        car.setCompany(company);
        car.setModel(model);
        return carRepository.save(car);
    }
}
