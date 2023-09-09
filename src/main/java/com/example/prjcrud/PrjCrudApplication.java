package com.example.prjcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.prjcrud.mapper")
public class PrjCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrjCrudApplication.class, args);
    }

}
