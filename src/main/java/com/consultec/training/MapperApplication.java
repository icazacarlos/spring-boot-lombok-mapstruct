package com.consultec.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consultec.training.mapper.CarMapper;
import com.consultec.training.model.domain.Car;
import com.consultec.training.model.domain.CarType;
import com.consultec.training.model.dto.CarDto;

@SpringBootApplication
public class MapperApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MapperApplication.class, args);
	}

	@Autowired
	CarMapper carMapper;

	@Override
	public void run(String... args) throws Exception {
		Car car = new Car("Explorer", 5, CarType.SEDAN);
		CarDto carDto = carMapper.carToCarDto(car);
		System.out.println(car);
		System.out.println(carDto);
	}
}
