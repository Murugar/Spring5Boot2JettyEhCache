package com.iqmsoft.jsr107;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class MainApp 
{
    public static void main(String[] args) 
    {
        SpringApplication.run(MainApp.class, args);
    }
}
