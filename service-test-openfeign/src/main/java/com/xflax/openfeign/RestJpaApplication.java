package com.xflax.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(
        basePackages = {"com.xflax.openfeign"
               , "com.xflax.library.acx"
        }
)
@EnableFeignClients(basePackages = "com.xflax.library.acx.feign")
public class RestJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestJpaApplication.class, args);
    }

}