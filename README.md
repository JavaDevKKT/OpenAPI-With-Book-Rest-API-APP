Spring Boot + Swagger/OpenAPI

<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.5.0</version>
		</dependency>

  @Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI libraryOpenAPI() {
		return new OpenAPI().info(new Info().title("Library Management System API")
				.description("API documentation for managing books, users, and loans").version("v1.0.0"));
	}
}

<img width="1915" height="1082" alt="image" src="https://github.com/user-attachments/assets/7c7036ac-f985-4024-bf91-511b32f0fc1a" />
