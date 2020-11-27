package com.fellakai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.fellakai")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
