package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

    @Autowired
    DiscountService discountService;
    private String brandName;
    private Double MaxRetailPrice;

  Bus(){

  }
//    @Autowired
//    Bus(DiscountService discountService){
//        this.discountService = discountService;
//    }
//    public void setDiscountService(DiscountService discountService) {
//      this.discountService = discountService;
//    }
    @Override
    public int mileage() {
        return 20;
    }

    @Override
    public String discount() {
        return discountService.discount();
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public Double getMaxRetailPrice() {
        return MaxRetailPrice;
    }

    public void setMaxRetailPrice(Double maxRetailPrice) {
        MaxRetailPrice = maxRetailPrice;
    }
}
