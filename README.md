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

<img width="1770" height="598" alt="image" src="https://github.com/user-attachments/assets/54727c67-5bf5-4120-a09b-53138c4e5806" />

<img width="1812" height="651" alt="image" src="https://github.com/user-attachments/assets/5e50f0f9-5685-4eca-8ec8-e433c794080a" />

<img width="1788" height="926" alt="image" src="https://github.com/user-attachments/assets/480640fc-26fb-442e-bd93-499c5cd959cf" />

<img width="1757" height="371" alt="image" src="https://github.com/user-attachments/assets/80c5e305-dc3c-4e3d-8953-e921ddad7df3" />

<img width="1757" height="371" alt="image" src="https://github.com/user-attachments/assets/239c91c9-31d4-44e7-999e-06c9b37c7df0" />

<img width="1758" height="562" alt="image" src="https://github.com/user-attachments/assets/a67185cb-7c4b-4d3a-9e68-a554099d4c80" />




