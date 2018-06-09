package com.hoho.test.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("test")
@ComponentScan(basePackages = "com.hoho.test.javaconfig")
@PropertySource("classpath:/property/app.properties")
public class BeanScan {

}
