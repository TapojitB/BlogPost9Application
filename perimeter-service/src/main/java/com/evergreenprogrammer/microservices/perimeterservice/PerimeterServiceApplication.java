package com.evergreenprogrammer.microservices.perimeterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableDiscoveryClient(autoRegister = true)
@SpringBootApplication
public class PerimeterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerimeterServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;

	}

}
