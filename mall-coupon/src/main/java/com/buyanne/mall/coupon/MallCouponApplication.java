package com.buyanne.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled", "true");
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
