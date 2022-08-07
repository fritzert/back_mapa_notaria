package com.frodas.notaria.mapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"other.directory"})
//@MapperScan( "other.directory.*.*.model.mapper")
public class NotariaBackendApplication {

// TODO: para desplegar war
//public class NotariaBackendApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(NotariaBackendApplication.class, args);
    }

// TODO: para desplegar war
/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NotariappBackendApplication.class);
	}*/

}
