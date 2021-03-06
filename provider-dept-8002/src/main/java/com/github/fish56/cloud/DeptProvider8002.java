package com.github.fish56.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 将服务注册到Eureka
@EnableDiscoveryClient
public class DeptProvider8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class, args);
    }
}
