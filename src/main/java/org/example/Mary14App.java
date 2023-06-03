package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.mapper")//扫描mapper层
public class Mary14App {
    public static void main(String[] args) {
        SpringApplication.run(Mary14App.class,args);
    }
}
