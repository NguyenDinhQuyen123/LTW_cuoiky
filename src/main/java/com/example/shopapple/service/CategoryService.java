package com.example.shopapple.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.example.shopapple.repository.CategoryRepository;  
import com.example.shopapple.models.Category;
import java.util.List;  

@Service  
public class CategoryService {  

    @Autowired  
    private CategoryRepository categoryRepository;  

    public List<Category> getAllCategories() {  
        return categoryRepository.findAll();  
    }  

    public Category getCategoryById(Long id) {  
        return categoryRepository.findById(id).orElse(null);  
    }  

    public Category createCategory(Category category) {  
        return categoryRepository.save(category);  
    }  

    public void deleteCategory(Long id) {  
        categoryRepository.deleteById(id);  
    }  
}