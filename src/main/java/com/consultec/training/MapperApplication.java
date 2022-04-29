package com.consultec.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.consultec.training.mapper.CarMapper;
import com.consultec.training.model.domain.Car;
import com.consultec.training.model.domain.CarType;
import com.consultec.training.model.dto.CarDto;

@SpringBootApplication
public class MapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapperApplication.class, args);
	}

	@Autowired
	CarMapper carMapper;

	@Bean
	public void testingMapper() {

		Car car = new Car("Explorer", 5, CarType.SEDAN);

		// CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
		CarDto carDto = carMapper.carToCarDto(car);

		System.out.println(car);
		System.out.println(carDto);

	}

}
