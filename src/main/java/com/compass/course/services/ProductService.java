package com.compass.course.services;

import com.compass.course.entities.Product;
import com.compass.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> findAll() {
        return repo.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repo.findById(id);
        return obj.get();
    }

}
