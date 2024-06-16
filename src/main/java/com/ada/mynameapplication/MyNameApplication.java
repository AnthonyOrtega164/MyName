package com.ada.mynameapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyNameApplication.class, args);
    }

    @RestController
    class NameController {

        @GetMapping("/name")
        public String getName() {
            return "AnthonyDOM164 - Anthony Ortega";
        }
    }
}
