package com.consultec.training.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.consultec.training.model.domain.Car;
import com.consultec.training.model.dto.CarDto;

@Mapper(componentModel = "spring")
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto carToCarDto(Car car);
}
