package com.example.shopapple.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
import com.example.shopapple.models.Product;  
import com.example.shopapple.service.ProductService;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
  

@RestController  
@RequestMapping("api/products")  
public class ProductController {  

    @Autowired  
    private ProductService productService;  

    /**
     * @return
     */
    @GetMapping  
  public ResponseEntity<List<Product>> getAllProducts() {  
        List<Product> products = productService.findAll();  
        return new ResponseEntity<>(products, HttpStatus.CREATED); 
    }  

    @GetMapping("/{id}")
public ResponseEntity <Product>  getProductById(@PathVariable  long id){
Product product = productService.findById(id);
if (product == null){
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 
}
return new ResponseEntity<>(product , HttpStatus.OK);
}
    

   @PostMapping
   public ResponseEntity<Product> createProducts(@RequestBody Product Product){
Product createProducts = productService.save(Product);
return new ResponseEntity<>(createProducts, HttpStatus.CREATED);
   }
    @DeleteMapping("/{id}")  
    public void deleteProduct(@PathVariable Long id) {  
        productService.deleteProduct(id);  
    }  
}
