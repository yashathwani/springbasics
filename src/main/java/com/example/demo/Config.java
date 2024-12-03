package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.example.demo")
@PropertySource("car.properties")
public class Config {

    @Bean
  public Car carr(){
    return new Car(discountService());
  }
  @Bean
    public DiscountService discountService(){
        return new DiscountServiceImp();
    }
}
