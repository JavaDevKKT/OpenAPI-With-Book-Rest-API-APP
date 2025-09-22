package com.ktech.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI libraryOpenAPI() {
		return new OpenAPI().info(new Info().title("Library Management System API")
				.description("API documentation for managing books, users, and loans").version("v1.0.0"));
	}
}