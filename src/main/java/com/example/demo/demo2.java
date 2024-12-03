package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class demo2
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Vehicle vehicle2=context.getBean("vehicle",Vehicle.class);
        Vehicle vehicle=context.getBean("car",Vehicle.class);
//        System.out.println(vehicle==vehicle2);
        System.out.println(vehicle.mileage());
//        System.out.println(vehicle.discount());
//        System.out.println(vehicle.getBrandName());
        System.out.println(vehicle.getMaxRetailPrice());


    }
}