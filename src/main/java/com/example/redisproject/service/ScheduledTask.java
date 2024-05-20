package com.example.redisproject.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private CarService carService;

    public ScheduledTask(CarService carService){
        this.carService=carService;
    }

    @Scheduled(cron = "0 * * * * *")
    public void excute(){
        System.out.println("Cron job called");
    }
}
