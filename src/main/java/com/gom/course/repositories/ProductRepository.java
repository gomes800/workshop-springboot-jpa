package com.gom.course.repositories;

import com.gom.course.entities.Category;
import com.gom.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
