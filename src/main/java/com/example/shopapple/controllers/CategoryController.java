package com.example.shopapple.controllers;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
import com.example.shopapple.models.Category;  
import com.example.shopapple.service.CategoryService;


import java.util.List;  

@RestController  
@RequestMapping("/api/categories")  
public class CategoryController {  

    @Autowired  
    private CategoryService categoryService;  

    @GetMapping  
    public List<Category> getAllCategories() {  
        return categoryService.getAllCategories();  
    }  

    @GetMapping("/{id}")  
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {  
        Category category = categoryService.getCategoryById(id);  
        return ResponseEntity.ok(category);  
    }  

    @PostMapping  
    public Category createCategory(@RequestBody Category category) {  
        return categoryService.createCategory(category);  
    }  

    @DeleteMapping("/{id}")  
    public void deleteCategory(@PathVariable Long id) {  
        categoryService.deleteCategory(id);  
    }  
}
