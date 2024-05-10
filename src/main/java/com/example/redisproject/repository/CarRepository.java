package com.example.redisproject.repository;

import com.example.redisproject.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long> {
    @Override
    Optional<Car> findById(Long id);

    @Override
    List<Car> findAll();
}
