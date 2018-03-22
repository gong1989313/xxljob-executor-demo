package com.bg.xxlJob.demo;

import com.banggood.silk.autoconfigure.webapi.EnableSilkWebApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSilkWebApi
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
