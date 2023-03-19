package com.csd.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:{AdminApplication}
 * Package:{com.csd.admin}
 * Description:
 *
 * @Date:2023-03-19 15:42
 * @Author:
 */
@SpringBootApplication
@MapperScan("com.csd.admin.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}

