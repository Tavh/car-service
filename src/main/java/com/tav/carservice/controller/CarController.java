package com.tav.carservice.controller;

import com.tav.carservice.model.CarEntity;
import com.tav.carservice.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("car")
@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping
    public void createCar(@RequestBody final CarEntity car) {
        carService.createCar(car);
    }

    @GetMapping("{id}")
    public CarEntity getCar(@PathVariable final long id) {
        return carService.getCar(id);
    }

    @DeleteMapping("{id}")
    public void deleteCar(@PathVariable final long id) {
        carService.deleteCar(id);
    }
}
