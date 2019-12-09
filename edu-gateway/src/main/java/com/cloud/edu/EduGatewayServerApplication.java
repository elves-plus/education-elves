package com.cloud.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *
 * @Author: xlr
 * @Date: Created in 上午11:08 2019/11/4
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EduGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduGatewayServerApplication.class, args);
    }


}
