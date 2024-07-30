package com.example;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

    public static void main(String[] args) {
        SpringApplication.run(MainTest.class, args);
    }

    @PostConstruct
    void test(){

    }
}
