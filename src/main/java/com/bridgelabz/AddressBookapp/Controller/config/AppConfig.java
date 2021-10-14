package com.bridgelabz.AddressBookapp.Controller.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AddressBookConfig setting up ModelMapper Configuration in application
 * @author Sampriti Roy Chowdhury
 * version 0.0.1
 * @since 15-10-2021
 */

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
