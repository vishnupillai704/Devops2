package com.example.firstproject.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import java.util.Collections;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build()
				.apiInfo(ApiDetails());
	}
	private ApiInfo ApiDetails() {
		return new ApiInfo(
				"Devops Api",
				"Api for first Project",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Vishnu Pillai","","vishnupillai704@gmail.com"),
				"Api License",
				"http://localhost:3000",
				Collections.emptyList());

	}
}
