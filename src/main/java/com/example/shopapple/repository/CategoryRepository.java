package com.example.shopapple.repository;
import com.example.shopapple.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;  

public interface CategoryRepository extends JpaRepository<Category, Long> {  
    // Thêm các phương thức truy vấn nếu cần  
}
