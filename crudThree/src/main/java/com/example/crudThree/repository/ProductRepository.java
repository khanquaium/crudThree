package com.example.crudThree.repository;

import com.example.crudThree.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

   Product findByName(String name);
}
