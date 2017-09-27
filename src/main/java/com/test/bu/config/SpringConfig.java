package com.test.bu.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.test.bu.dao", "com.test.bu.service"})
public class SpringConfig {
}
