package com.tav.carservice.service;

import com.tav.carservice.model.CarEntity;
import com.tav.carservice.repo.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public void createCar(final CarEntity car) {
        carRepository.save(car);
    }

    public CarEntity getCar(final long id) {
        return carRepository.findById(id).orElse(null);
    }

    public void deleteCar(final long id) {
        carRepository.deleteById(id);
    }
}
