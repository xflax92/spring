package com.xflax.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(basePackages = {"com.xflax.restful", "com.xflax.library.acx"})
public class RestJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestJpaApplication.class, args);
    }

}