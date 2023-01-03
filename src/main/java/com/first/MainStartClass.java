package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class MainStartClass {
		public static void main(String[] args) {
			SpringApplication.run(MainStartClass.class, args);
		}
		
		@GetMapping("/msg")
		public String msg() {
			return "hii";
		}
}
