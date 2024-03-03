package com.example.minitest1_car.service;

import com.example.minitest1_car.model.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    Car findByID(int id);
    void save(Car car);

    void remove(int id);

}
