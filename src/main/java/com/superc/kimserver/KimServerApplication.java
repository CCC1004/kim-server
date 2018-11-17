package com.superc.kimserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.superc.kimserver.dao")
public class KimServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimServerApplication.class, args);
    }
}
