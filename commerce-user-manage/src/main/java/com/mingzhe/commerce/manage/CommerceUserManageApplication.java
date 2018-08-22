package com.mingzhe.commerce.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mingzhe.commerce.manage.mapper")
public class CommerceUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceUserManageApplication.class, args);
    }
}
