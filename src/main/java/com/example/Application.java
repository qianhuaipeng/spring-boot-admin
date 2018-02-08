package com.example;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * author: alan.peng
 * description:
 * date: create in 16:19 2018/2/6
 * modified By：
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
