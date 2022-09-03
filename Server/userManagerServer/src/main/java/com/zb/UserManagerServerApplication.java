package com.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zaf
 * @date 2021/7/27 14:43 上午
 * @description
 **/
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zb.Mapper")
public class UserManagerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagerServerApplication.class, args);
        System.out.println("----swagger  http://localhost:8000/doc.html");

    }
}
