package com.example.shopapple.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.example.shopapple.models.Product;  
import com.example.shopapple.repository.ProductRepository;  

import java.util.List;  

@Service  
public class ProductService {  

    @Autowired  
    private ProductRepository productRepository;  


    public List<Product> findAll() {  
        return productRepository.findAll();  
    }  
 public Product save(Product product){
    return productRepository.save(product);
 }
    public Product findById(Long id) {  
        return productRepository.findById(id).orElse(null);  
    }  

    public void deleteProduct(Long id) {  
        productRepository.deleteById(id);  
    }  

    // Các phương thức khác như update, tìm kiếm theo tiêu chí...  
}
