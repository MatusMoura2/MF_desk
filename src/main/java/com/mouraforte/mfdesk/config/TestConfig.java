package com.mouraforte.mfdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mouraforte.mfdesk.service.DBService;

@Configuration
@Profile("dev")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;

	@Bean
	public boolean initialDB() {
		if (value.equals("create")) {
			this.dbService.initialDB();
		}
		return false;
	}

}
