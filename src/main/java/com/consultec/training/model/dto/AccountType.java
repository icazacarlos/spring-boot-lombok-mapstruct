package com.consultec.training.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountType {

	CHECKING("CHECKING"),
	SAVINGS("SAVINGS"),
	CHRISTMAS("CHRISTMAS");

	private String type;

}
