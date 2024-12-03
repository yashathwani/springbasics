package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Car implements Vehicle {

//    @Autowired
    DiscountService discountService;
    private String brandName;

//    @Value("${car.mrp}")
    private Double MaxRetailPrice;

    Car() {

    }
//
//    @Autowired
//    Car(DiscountService discountService){
//        this.discountService = discountService;
//    }

//    @Autowired
//    public void setDiscountService(DiscountService discountService) {
//        this.discountService = discountService;
//    }
    @Override
    public int mileage() {
        return 10;
    }

    @Override
    public String discount() {
        return discountService.discount();
    }

    public String getBrandName() {
        return brandName;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getMaxRetailPrice() {
        return MaxRetailPrice;
    }

    public void setMaxRetailPrice(Double maxRetailPrice) {
        MaxRetailPrice = maxRetailPrice;
    }
}
