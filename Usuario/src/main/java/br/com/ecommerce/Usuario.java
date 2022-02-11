package br.com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class Usuario {
    public static void main(String[] args) {
        SpringApplication.run(Usuario.class,args);
    }
}
