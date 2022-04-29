package com.consultec.training.model.domain;

import lombok.Getter;

@Getter
public enum CarType {

	SUV("SUV"), TRUCK("TRUCK"), HATCHBACK("HATCHBACK"), MUSCLE("MUSCLE"), SEDAN("SEDAN");

	private String carType;

	CarType(String carType) {
		this.carType = carType;
	}
}
