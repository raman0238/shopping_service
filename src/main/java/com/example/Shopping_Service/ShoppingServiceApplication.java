package com.example.Shopping_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan
public class ShoppingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingServiceApplication.class, args);
	}
	  @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.example.Shopping_Service"))  // // Generate API of EndPoints which is available inside defined package
	                .paths(PathSelectors.any())   // for all EndPoints
	                .build();             // create object
	    }
}
//checking webhook
