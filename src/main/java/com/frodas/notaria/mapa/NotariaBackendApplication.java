package com.frodas.notaria.mapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"other.directory"})
//@MapperScan( "other.directory.*.*.model.mapper")
public class NotariaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotariaBackendApplication.class, args);
    }


}
