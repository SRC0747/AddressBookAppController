package com.bridgelabz.AddressBookapp.Controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerTypePredicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * AddressBookConfig setting up EnableSwagger2 Configuration required in application
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bridgelabz"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata());
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("Address Book Application API")
                .description("\"Swagger configuration for application testing\"")
                .version("0.0.1")
                .license("Apache 2.0 (example)")
                .licenseUrl("if there will be any")
                .contact(new Contact("Sampriti", "www.facebook.com", "sampritirc@gmail.com"))
                .build();
    }
}
