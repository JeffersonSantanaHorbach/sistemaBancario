package io.github.JeffersonSantanaHorbach;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BancoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BancoApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner initialization() {
//        return args -> {
//            System.out.println("Hello World");
//        };
//    }


}

