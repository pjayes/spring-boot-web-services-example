package com.pjayes.todo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.pjayes.todo" })
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
