package com.example.shopapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@SpringBootApplication
public class ShopappleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopappleApplication.class, args);
	}

}


