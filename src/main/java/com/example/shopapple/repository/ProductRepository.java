package com.example.shopapple.repository;
import com.example.shopapple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;  

public interface ProductRepository extends JpaRepository<Product, Long> {  
    // Thêm các phương thức truy vấn nếu cần  
}
