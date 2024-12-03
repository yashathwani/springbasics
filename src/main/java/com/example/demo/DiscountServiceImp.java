package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DiscountServiceImp implements DiscountService{
    @Override
    public String discount() {

        return "i will give you the discount";
    }
}
