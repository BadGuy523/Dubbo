package com.zjq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: BadGuy
 * @date: 2020-03-21 14:10
 **/
@SpringBootApplication(scanBasePackages = {"com.zjq"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
