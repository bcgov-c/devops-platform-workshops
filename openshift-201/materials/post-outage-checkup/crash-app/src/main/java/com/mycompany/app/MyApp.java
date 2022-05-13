package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
		System.out.println("Starting Crash App");
		if (null == System.getenv().get("DEPLOY_ENV")) {
			System.err.println("Missing DEPLOY_ENV variable");
			System.exit(1);
		}
		SpringApplication.run(MyApp.class, args);
	}
}
