package com.example.shopapple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/")
public class homeController {
    @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/shop")
    public String Shop() {
        return "shop";
    }
    @GetMapping("/shop-detail")
    public String ShopDetail() {
        return "shop-detail";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
    @PostMapping("/checkout")
    public String checkoutSuccess() {
        return "checkout";
    }
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
    @GetMapping("/testimonial")
    public String testimonial() {
        return "testimonial";
    }
    @GetMapping("/404")
    public String payNotFound() {
        return "404";
    }
    
}
