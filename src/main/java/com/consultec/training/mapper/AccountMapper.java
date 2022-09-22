package com.consultec.training.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.consultec.training.model.domain.Cuenta;
import com.consultec.training.model.dto.AccountDTO;

@Mapper(componentModel = "spring")
public interface AccountMapper {

	AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

	@Mapping(source = "numero", target = "number")
	@Mapping(source = "nombre", target = "name")
	@Mapping(source = "balance", target = "balance.available")
	@Mapping(source = "tipo", target = "type")
	AccountDTO cuentaToAccountDto(Cuenta cuenta);
}
