package com.zhs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zhs.sys.mapper"})
public class ZApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZApplication.class, args);
    }

}
