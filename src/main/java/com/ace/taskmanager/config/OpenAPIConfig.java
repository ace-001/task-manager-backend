package com.ace.taskmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {

	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Task Management API").version("1.0")
				.description("API documentation for Task Management Application"));
	}
}
