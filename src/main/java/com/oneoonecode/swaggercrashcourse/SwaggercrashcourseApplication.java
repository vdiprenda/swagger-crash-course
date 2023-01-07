package com.oneoonecode.swaggercrashcourse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title="ToDo Items Project", description = "Vinnies Swagger App", version = "1.3"),
		servers = {
				@Server(url = "http://localhost:8080", description = "development"),
				@Server(url = "http://localhost:8080", description = "QA")
		}
)
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}

}
