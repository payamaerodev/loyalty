package com.hamrasta.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableJpaRepositories(basePackages = {"com.hamrasta"})
@EntityScan(basePackages = {"com.hamrasta"})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {"com.hamrasta"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
