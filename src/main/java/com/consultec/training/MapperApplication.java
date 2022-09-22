package com.consultec.training;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consultec.training.mapper.AccountMapper;
import com.consultec.training.model.domain.Cuenta;
import com.consultec.training.model.dto.AccountDTO;

@SpringBootApplication
public class MapperApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MapperApplication.class, args);
	}

	@Autowired
	AccountMapper accountMapper;

	@Override
	public void run(String... args) throws Exception {

		Cuenta cuenta = Cuenta.builder()
			.nombre("nombre")
			.numero("12345")
			.tipo("CHECKING")
			.balance(new BigDecimal("120.0"))
			.build();
		
		AccountDTO account = accountMapper.cuentaToAccountDto(cuenta);
		
		System.out.println(account);
	}
}
