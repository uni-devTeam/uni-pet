package com.example.unipet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.example.unipet"})
@MapperScan(value = {"com.example.unipet.boards.dao"})
public class UnipetApplication {
    public static void main(String[] args) {
        SpringApplication.run(UnipetApplication.class, args);
    }

}
