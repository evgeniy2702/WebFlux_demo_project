package com.example.WebFlux_demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.PathMatchConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.util.function.Predicate;

@SpringBootApplication
public class WebFluxDemoProjectApplication implements WebFluxConfigurer {


	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new DateFormatter("yy-MM-dd"));
	}


	public static void main(String[] args) {
		SpringApplication.run(WebFluxDemoProjectApplication.class, args);
	}

}
